package com.aprendizaje.spring.cap3.ex6_circularReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Loro {
	private String nombre = "Koko";
	private final Persona persona;
	
	@Autowired
	public Loro(Persona persona) {
		this.persona = persona;
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
