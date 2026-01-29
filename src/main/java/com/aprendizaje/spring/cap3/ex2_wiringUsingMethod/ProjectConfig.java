package com.aprendizaje.spring.cap3.ex2_wiringUsingMethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
	
	@Bean
	public Loro loro() {
		Loro l = new Loro();
		l.setNombre("Koko");
		return l;
	}
	
	@Bean
	public Persona persona() {
		Persona p = new Persona();
		p.setNombre("Mili");
		/*
		 * Definimos la relacion entre la Persona y el Loro llamando directamente al método que devuelve la referencia Bean
		 * que queremos obtener, en este caso, llamamos al método que devuelve la referencia del bean del loro.
		 * 
		 * Esto resulta, en la relación de que ahora la Persona tiene un Loro.
		 * 
		 * No necesariamente crea un bean loro(), Spring context es inteligente y detecta los siguientes casos:
		 * 	- Si el bean Loro no existe en el context, lo crea llamando al método loro() y devuelve la referencia correspondiente.
		 *  - Si el bean Loro existe en el context, devuelve directamente la referencia al bean.
		 */
		p.setLoro(loro());
		return p;
	}
	
}
