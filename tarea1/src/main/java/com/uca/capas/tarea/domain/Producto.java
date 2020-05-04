package com.uca.capas.tarea.domain;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class Producto {
	
	@Size(min=12, max=12, message = "El campo codigo debe tener una longitud de 12 números.")
	String codigo;
	
	@Size(min=1, max=100, message = "El campo nombre debe tener una longitud entre 1 y 100 caracteres.")
	String nombre;
	
	@Size(min=1, max=100, message = "El campo marca debe tener una longitud entre 1 y 100 caracteres.")
	String marca;
	
	@Size(min=1, max=500, message = "El campo descripcion debe tener una longitud entre 1 y 500 caracteres.")
	String descripcion;
	
	
	@NotEmpty(message="El campo existencia no puede ir vacio")
	String existencias;
	
	@NotEmpty(message="El campo fecha no debe ir vacio")
	
	String fecha_ingreso;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo( String codigo) {
		this.codigo=codigo;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca=marca;
	}
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion=descripcion;
	}
	public String getExistencias() {
		return existencias;
	}

	public void setExistencias(String existencias) {
		this.existencias=existencias;
	}
	
	public String getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso=fecha_ingreso;
	}

	
	
}
