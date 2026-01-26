package com.aprendizaje.spring.cap3.ex1_noWiring;

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
		return p;
	}
	
}
