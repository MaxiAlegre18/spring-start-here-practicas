package com.aprendizaje.spring.cap2.addBeanWithStereotype;

import org.springframework.stereotype.Component;

@Component
public class Loro {
	private String nombre;
	
	public Loro() {
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
