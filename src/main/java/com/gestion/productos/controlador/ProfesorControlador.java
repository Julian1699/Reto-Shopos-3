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

import com.gestion.productos.entidades.Profesor;
import com.gestion.productos.servicio.ProfesorServicio;

@Controller
@RequestMapping
public class ProfesorControlador {
	@Autowired
	private ProfesorServicio profesorServicio;

	@RequestMapping("/listar_profesor")
	public String verPaginaDeInicio(Model modelo,@Param("palabraClave") String palabraClave){
		List<Profesor> listaProfesors = profesorServicio.listAll(palabraClave);
		modelo.addAttribute("listaProfesors", listaProfesors);
		modelo.addAttribute("palabraClave", palabraClave);
		return "index";
	}

	@GetMapping("/nuevo_profesor")
	public String mostrarFormularioDeRegistrarProfesor(Model modelo) {
		Profesor profesor = new Profesor();
		modelo.addAttribute("profesor",profesor);
		return "nuevo_profesor";
	}
	
	@PostMapping("/guardar_profesor")
	public String guardarProfesor(@ModelAttribute("profesor") Profesor profesor) {
		profesorServicio.save(profesor);
		return "redirect:/listar_profesor";
	}
	
	@GetMapping("/editar_profesor/{id}")
	public ModelAndView mostrarFormularioDeEditarProfesor(@PathVariable (name= "id")Long id){
		ModelAndView modelo = new ModelAndView("editar_profesor");
		Profesor profesor = profesorServicio.get(id);
		modelo.addObject("profesor", profesor);
		return modelo;
	}

	@GetMapping("/eliminar_profesor/{id}")
	public String eliminarProfesor(@PathVariable(name="id")Long id) {
		profesorServicio.delete(id);
		return "redirect:/listar_profesor";
	}

	@GetMapping("/detalles_profesor/{id}")
	public String verDetallesDelProfesor(@PathVariable(value = "id") Long id,Map<String,Object> modelo,RedirectAttributes flash) {
		Profesor profesor = profesorServicio.get(id);
		if(profesor == null) {
			flash.addFlashAttribute("error", "El profesor no existe en la base de datos");
			return "redirect:/index";
		}
		modelo.put("profesor",profesor);
		modelo.put("titulo", "Detalles del profesor " + profesor.getNombre());
		return "detalles_profesor";
	}
}
