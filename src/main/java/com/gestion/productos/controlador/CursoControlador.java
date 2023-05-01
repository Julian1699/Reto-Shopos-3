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
import com.gestion.productos.entidades.Curso;
import com.gestion.productos.entidades.Profesor;
import com.gestion.productos.servicio.AlumnoServicio;
import com.gestion.productos.servicio.CursoServicio;
import com.gestion.productos.servicio.ProfesorServicio;

@Controller
@RequestMapping
public class CursoControlador {
	@Autowired
	private CursoServicio cursoServicio;
	@Autowired
	private ProfesorServicio profesorServicio;
	@Autowired
	private AlumnoServicio alumnoServicio;

	@RequestMapping("/listar_curso")
	public String verPaginaDeInicio(Model modelo,@Param("palabraClave") String palabraClave){
		List<Curso> listaCursos = cursoServicio.listAll(palabraClave);
		modelo.addAttribute("listaCursos", listaCursos);
		modelo.addAttribute("palabraClave", palabraClave);
		return "index";
	}

	@GetMapping("/nuevo_curso")
	public String mostrarFormularioDeRegistrarCurso(Model modelo) {
		Curso curso = new Curso();
		modelo.addAttribute("curso",curso);
		return "nuevo_curso";
	}
	
	@PostMapping("/guardar_curso")
	public String guardarCurso(@ModelAttribute("curso") Curso curso) {
		cursoServicio.save(curso);
		return "redirect:/listar_curso";
	}
	
	@GetMapping("/editar_curso/{id}")
	public ModelAndView mostrarFormularioDeEditarCurso(@PathVariable (name= "id")Long id){
		ModelAndView modelo = new ModelAndView("editar_curso");
		Curso curso = cursoServicio.get(id);
		modelo.addObject("curso", curso);
		return modelo;
	}

	@GetMapping("/eliminar_curso/{id}")
	public String eliminarCurso(@PathVariable(name="id")Long id) {
		cursoServicio.delete(id);
		return "redirect:/listar_curso";
	}
	
	@GetMapping("/detalles_curso/{id}")
	public String verDetallesDelCurso(@PathVariable(value = "id") Long id,Map<String,Object> modelo,RedirectAttributes flash) {
		Curso curso = cursoServicio.get(id);
		Profesor profesor = profesorServicio.get(id);
		Alumno alumno = alumnoServicio.get(id);
		if(curso == null) {
			flash.addFlashAttribute("error", "El curso no existe en la base de datos");
			return "redirect:/index";
		}
		modelo.put("curso",curso);
		modelo.put("profesor",profesor);
		modelo.put("alumno",alumno);
		modelo.put("titulo", "Detalles del curso " + curso.getNombre());
		return "detalles_curso";
	}
}
