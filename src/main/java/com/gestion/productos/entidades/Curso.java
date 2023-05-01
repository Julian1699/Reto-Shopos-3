package com.gestion.productos.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cursos")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_curso")
    private Long id;

    @Column(name = "nombre_curso")
    private String nombre;

    @Column(name = "creditos")
    private Integer creditos;

    @Column(name = "cupos")
    private Integer cupos;

	@Column(name = "facultad")
    private String facultad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_alumno", referencedColumnName = "id_alumno")
    private Alumno id_alumno;
		
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profesor", referencedColumnName = "id_profesor")
    private Profesor id_Profesor;
	
	public Curso() {
		super();
	}

	public Curso(Long id, String nombre, Integer creditos, Integer cupos, String facultad, Alumno id_alumno,
			Profesor id_Profesor) {
		this.id = id;
		this.nombre = nombre;
		this.creditos = creditos;
		this.cupos = cupos;
		this.facultad = facultad;
		this.id_alumno = id_alumno;
		this.id_Profesor = id_Profesor;
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


	public Integer getCreditos() {
		return creditos;
	}


	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}


	public Integer getCupos() {
		return cupos;
	}


	public void setCupos(Integer cupos) {
		this.cupos = cupos;
	}


	public String getFacultad() {
		return facultad;
	}


	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}


	public Alumno getId_alumno() {
		return id_alumno;
	}


	public void setId_alumno(Alumno id_alumno) {
		this.id_alumno = id_alumno;
	}


	public Profesor getId_Profesor() {
		return id_Profesor;
	}


	public void setId_Profesor(Profesor id_Profesor) {
		this.id_Profesor = id_Profesor;
	}

	

	
}



