package com.gestion.productos.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profesores")
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profesor")
    private Long id;

    @Column(name = "nombre_profesor")
    private String nombre;

    @Column(name = "titulo_academico")
    private String tituloAcademico;

    @Column(name = "anos_experiencia")
    private Integer anosExperiencia;

    @Column(name = "facultad")
    private String facultad;

    @Column(name = "nombre_curso")
    private String nombre_curso;

    public Profesor() {
		super();
	}

    public Profesor(Long id, String nombre, String tituloAcademico, Integer anosExperiencia, String facultad,
            String nombre_curso) {
        this.id = id;
        this.nombre = nombre;
        this.tituloAcademico = tituloAcademico;
        this.anosExperiencia = anosExperiencia;
        this.facultad = facultad;
        this.nombre_curso = nombre_curso;
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

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public Integer getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(Integer anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }



   

}
