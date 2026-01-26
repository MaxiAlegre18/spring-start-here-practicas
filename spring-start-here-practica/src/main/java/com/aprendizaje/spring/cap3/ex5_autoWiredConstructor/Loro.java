package com.aprendizaje.spring.cap3.ex5_autoWiredConstructor;

import org.springframework.stereotype.Component;

@Component
public class Loro {
	private String nombre = "Koko";

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
