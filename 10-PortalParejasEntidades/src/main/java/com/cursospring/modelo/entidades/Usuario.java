package com.cursospring.modelo.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Access(AccessType.FIELD)
public class Usuario implements Serializable{

	@Id
	@NotEmpty
	private String nombre;
	@NotEmpty
	private String password;
	@NotNull
	private float altura;
	@NotNull
	private LocalDate fechaNacimiento;
	@NotNull
	private String genero;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Usuario(String nombre, String password, float altura, LocalDate fechaNacimiento, String genero) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.altura = altura;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
	}
	public Usuario() {
		super();
	}
	public Usuario(String nombre, String password) {
		super();
		this.nombre = nombre;
		this.password = password;
	}
}
