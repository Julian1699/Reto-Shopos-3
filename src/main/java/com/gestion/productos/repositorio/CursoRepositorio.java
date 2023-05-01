package com.gestion.productos.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gestion.productos.entidades.Curso;

public interface CursoRepositorio extends JpaRepository<Curso, Long>{
		
		@Query("SELECT c FROM Curso c WHERE" 
				+ " CONCAT(c.id,c.nombre,c.creditos,c.cupos,c.facultad)"
				+ " LIKE %?1%")
		public List<Curso> findAll(String palabraClave);
}

