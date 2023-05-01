package com.gestion.productos.controlador;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gestion.productos.entidades.Alumno;
import com.gestion.productos.entidades.Profesor;
import com.gestion.productos.servicio.AlumnoServicio;
import com.gestion.productos.servicio.ProfesorServicio;

@Controller
@RequestMapping
public class AlumnoControlador {
	@Autowired
	private AlumnoServicio alumnoServicio;
	@Autowired
	private ProfesorServicio profesorServicio;

	@RequestMapping("/listar_alumno")
	public String verPaginaDeInicio(Model modelo,@Param("palabraClave") String palabraClave){
		List<Alumno> listaAlumnos = alumnoServicio.listAll(palabraClave);
		modelo.addAttribute("listaAlumnos", listaAlumnos);
		modelo.addAttribute("palabraClave", palabraClave);
		return "index";
	}

	@GetMapping("/nuevo_alumno")
	public String mostrarFormularioDeRegistrarAlumno(Model modelo) {
		Alumno alumno = new Alumno();
		modelo.addAttribute("alumno",alumno);
		return "nuevo_alumno";
	}
	
	@PostMapping("/guardar_alumno")
	public String guardarAlumno(@ModelAttribute("alumno") Alumno alumno) {
		alumnoServicio.save(alumno);
		return "redirect:/listar_alumno";
	}
	
	@GetMapping("/editar_alumno/{id}")
	public ModelAndView mostrarFormularioDeEditarAlumno(@PathVariable (name= "id")Long id){
		ModelAndView modelo = new ModelAndView("editar_alumno");
		Alumno alumno = alumnoServicio.get(id);
		modelo.addObject("alumno", alumno);
		return modelo;
	}

	@GetMapping("/eliminar_alumno/{id}")
	public String eliminarAlumno(@PathVariable(name="id")Long id) {
		alumnoServicio.delete(id);
		return "redirect:/listar_alumno";
	}

	@GetMapping("/detalles_alumno/{id}")
	public String verDetallesDelAlumno(@PathVariable(value = "id") Long id,Map<String,Object> modelo,RedirectAttributes flash) {
		Alumno alumno = alumnoServicio.get(id);
		Profesor profesor = profesorServicio.get(id);
		if(alumno == null) {
			flash.addFlashAttribute("error", "El alumno no existe en la base de datos");
			return "redirect:/index";
		}
		modelo.put("alumno",alumno);
		modelo.put("profesor",profesor);
		modelo.put("titulo", "Detalles del alumno " + alumno.getNombre());
		return "detalles_alumno";
	}
}
