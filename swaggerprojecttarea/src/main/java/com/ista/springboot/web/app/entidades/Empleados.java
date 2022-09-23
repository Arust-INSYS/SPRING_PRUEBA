package com.ista.springboot.web.app.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "empleados")

public class Empleados {
	@Id	
	private int id;
	private String nombre;
	private String apellido;
	private String ci;

	
	@Temporal(TemporalType.DATE)
	private Date fecha_n;
	
	private String direccion;
	private String sexo;
	private int salario;
	private int superci;
	private int dno;
	
	@PrePersist
	public void prePersist() {
		fecha_n = new Date();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}

	
	public Date getFecha_n() {
		return fecha_n;
	}
	public void setFecha_n(Date fecha_n) {
		this.fecha_n = fecha_n;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getSuperci() {
		return superci;
	}
	public void setSuperci(int superci) {
		this.superci = superci;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	
	
	

}
