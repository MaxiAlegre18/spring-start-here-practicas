package com.aprendizaje.spring.cap3.ex6_circularReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Persona {
	private String nombre = "Mili";
	
	private final Loro loro;
	
	/*
	 * Cuando Spring crea un bean del tipo Persona, la anotacion @Autowired le indica a Spring que debe inyectar un
	 * bean del tipo loro. De esta manera, podemos marcar el atributo loro como final.
	 */
	@Autowired
	public Persona(Loro loro) {
		this.loro = loro;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Loro getLoro() {
		return loro;
	}
	
}
