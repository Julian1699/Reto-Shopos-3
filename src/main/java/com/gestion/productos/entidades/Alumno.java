package com.gestion.productos.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumnos")
public class Alumno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno",nullable = false, length = 60)
    private Long id;

    @Column(name = "nombre_alumno",nullable = false, length = 60)
    private String nombre;

    @Column(name = "facultad",nullable = false, length = 60)
    private String facultad;

    @Column(name = "nombre_curso",nullable = false, length = 60)
    private String curso;

    @Column(name = "semestre",nullable = false, length = 60)
    private String semestre;

    @Column(name = "creditos_inscritos",nullable = false, length = 60)
    private Integer creditosInscritos;

    public Alumno() {
		super();
	}

    public Alumno(Long id, String nombre, String facultad, String curso, String semestre, Integer creditosInscritos) {
        this.id = id;
        this.nombre = nombre;
        this.facultad = facultad;
        this.curso = curso;
        this.semestre = semestre;
        this.creditosInscritos = creditosInscritos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public Integer getCreditosInscritos() {
        return creditosInscritos;
    }

    public void setCreditosInscritos(Integer creditosInscritos) {
        this.creditosInscritos = creditosInscritos;
    }

 
   
    
}
