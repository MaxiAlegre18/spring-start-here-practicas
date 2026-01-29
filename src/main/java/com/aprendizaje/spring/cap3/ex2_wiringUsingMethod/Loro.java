package com.aprendizaje.spring.cap3.ex2_wiringUsingMethod;

public class Loro {
	private String nombre;

	public Loro() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Loro [nombre=" + nombre + "]";
	}
	
	
}
