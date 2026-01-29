package com.aprendizaje.spring.cap3.ex3_wiringUsingParameter;

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
	/*
	 * Por medio del parametro, le indicamos a Spring que nos provea un Bean de tipo Loro del context.
	 */
	public Persona persona(Loro loro) {
		Persona p = new Persona();
		p.setNombre("Mili");
		/*
		 * Establecemos el valor de Loro en la persona P. De esta manera, le asignamos el Loro que nos proveyó el Spring context.
		 */
		p.setLoro(loro);
		return p;
	}
	
}
