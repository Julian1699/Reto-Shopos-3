package com.gestion.productos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.productos.entidades.Profesor;
import com.gestion.productos.repositorio.ProfesorRepositorio;

@Service
public class ProfesorServicio {
	
	@Autowired
	private ProfesorRepositorio profesorRepositorio;
	
	public List<Profesor> listAll(String palabraClave){
	    if(palabraClave != null) {
			
	    	return profesorRepositorio.findAll(palabraClave);
	    }
	    	
		return profesorRepositorio.findAll();
	}
	
	public void save(Profesor profesor) {
		profesorRepositorio.save(profesor);
	}
	
	public Profesor get(Long id) {
		return profesorRepositorio.findById(id).get();
	}
	
	public void delete(Long id) {
		profesorRepositorio.deleteById(id);
	}
}
