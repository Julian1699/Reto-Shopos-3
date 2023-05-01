package com.gestion.productos.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gestion.productos.entidades.Alumno;

public interface AlumnoRepositorio extends JpaRepository<Alumno, Long>{
		
		@Query("SELECT a FROM Alumno a WHERE" 
				+ " CONCAT(a.id,a.nombre,a.facultad,a.curso,a.semestre,a.creditosInscritos)"
				+ " LIKE %?1%")
		public List<Alumno> findAll(String palabraClave);		
}
