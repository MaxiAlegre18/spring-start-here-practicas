package com.aprendizaje.spring.cap3.ex4_autoWiredClassFields;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Persona {
	private String nombre = "Mili";
	
	/*
	 * Con la anotación Autowired, le instruimos a Spring que nos inyecte un valor apropiado (en este caso, un Bean del tipo Loro)
	 * a este atributo.
	 */
	@Autowired
	private Loro loro;
	
	public Persona() {

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
	public void setLoro(Loro loro) {
		this.loro = loro;
	}
	
	
}
