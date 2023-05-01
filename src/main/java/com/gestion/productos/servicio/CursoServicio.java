package com.gestion.productos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.productos.entidades.Curso;
import com.gestion.productos.repositorio.CursoRepositorio;

@Service
public class CursoServicio {
	
	@Autowired
	private CursoRepositorio cursoRepositorio;
	
	public List<Curso> listAll(String palabraClave){
	    if(palabraClave != null) {
			
	    	return cursoRepositorio.findAll(palabraClave);
	    }
	    	
		return cursoRepositorio.findAll();
	}
	public void save(Curso curso) {
		cursoRepositorio.save(curso);
	}
	
	public Curso get(Long id) {
		return cursoRepositorio.findById(id).get();
	}
	
	public void delete(Long id) {
		cursoRepositorio.deleteById(id);
	}
}
