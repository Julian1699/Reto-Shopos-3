package com.gestion.productos.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gestion.productos.entidades.Profesor;

public interface ProfesorRepositorio extends JpaRepository<Profesor, Long>{
		
		@Query("SELECT p FROM Profesor p WHERE" 
				+ " CONCAT(p.id,p.nombre,p.tituloAcademico,p.anosExperiencia,p.facultad,p.nombre_curso)"
				+ " LIKE %?1%")
		public List<Profesor> findAll(String palabraClave);
}
