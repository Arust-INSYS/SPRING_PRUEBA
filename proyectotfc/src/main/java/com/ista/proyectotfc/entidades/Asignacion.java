package com.ista.proyectotfc.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asignacion")
public class Asignacion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id_asignacion;
	private String descripcion;
	private int id_tutor_academico;
	
	public Long getId_asignacion() {
		return id_asignacion;
	}
	public void setId_asignacion(Long id_asignacion) {
		this.id_asignacion = id_asignacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getId_tutor_academico() {
		return id_tutor_academico;
	}
	public void setId_tutor_academico(int id_tutor_academico) {
		this.id_tutor_academico = id_tutor_academico;
	}
	
	
	
	
}
