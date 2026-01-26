package com.aprendizaje.spring.cap3.ex1_noWiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Persona persona = context.getBean(Persona.class);
		Loro loro = context.getBean(Loro.class);
		System.out.println("Nombre de la persona: " + persona.getNombre());
		System.out.println("Nombre del loro: " + loro.getNombre());
		System.out.println("Loro de la persona (direccion memoria): " + persona.getLoro());
		System.out.println("### El resultado es null pues aun no estan relacionados los beans. La persona aun no tiene el loro. ###");
		
	}

}
