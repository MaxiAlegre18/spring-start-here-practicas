package com.aprendizaje.spring.cap3.ex7_chosingFromMultipleBeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
	
	@Bean
	public Loro loro1() {
		Loro l = new Loro();
		l.setNombre("Koko");
		return l;
	}
	
	@Bean
	public Loro loro2() {
		Loro l = new Loro();
		l.setNombre("Miki");
		return l;
	}
	
	
	/*
	 * Por medio del parametro, le indicamos a Spring que nos provea un Bean de tipo Loro del context.
	 * Notemos que hay dos beans, loro1 y loro2.
	 * 
	 * Si el parametro es: (Loro loro). Ocurrira un error "No qualifying bean" puesto que al haber dos instancias de loro, Spring
	 * no sabe cual bean asignarle a la Persona.
	 * 
	 * Para que esto no ocurra, se podría hacer matchear el nombre del parametro con el nombre del bean, en este caso, podríamos usar
	 * como parametro (Loro loro1) ó (Loro loro2).
	 * 
	 * Otra forma mas elegante de hacerlo, es con la anotación @Qualifier, donde le indicamos el nombre del bean que tiene
	 * preferencia, para que no haya ambiguedad.
	 * 
	 */
	@Bean
	public Persona persona(@Qualifier("loro2") Loro loro) {
		Persona p = new Persona();
		p.setNombre("Mili");
		/*
		 * Establecemos el valor de Loro en la persona P. De esta manera, le asignamos el Loro que nos proveyó el Spring context.
		 */
		p.setLoro(loro);
		return p;
	}
	
}
