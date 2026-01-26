package com.aprendizaje.spring.cap3.ex1_noWiring;

public class Persona {
	private String nombre;
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
