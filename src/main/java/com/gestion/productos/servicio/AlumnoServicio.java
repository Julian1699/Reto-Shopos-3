package com.gestion.productos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.productos.entidades.Alumno;
import com.gestion.productos.repositorio.AlumnoRepositorio;

@Service
public class AlumnoServicio {
	
	@Autowired
	private AlumnoRepositorio alumnoRepositorio;
	
	public List<Alumno> listAll(String palabraClave){
	    if(palabraClave != null) {
			
	    	return alumnoRepositorio.findAll(palabraClave);
	    }
	    	
		return alumnoRepositorio.findAll();
	}
	
	public void save(Alumno alumno) {
		alumnoRepositorio.save(alumno);
	}
	
	public Alumno get(Long id) {
		return alumnoRepositorio.findById(id).get();
	}
	
	public void delete(Long id) {
		alumnoRepositorio.deleteById(id);
	}
}
