package com.aprendizaje.spring.cap3.ex2_wiringUsingMethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Persona persona = context.getBean(Persona.class);
		Loro loro = context.getBean(Loro.class);
		System.out.println("Nombre de la persona: " + persona.getNombre());
		System.out.println("Nombre del loro: " + loro.getNombre());
		System.out.println("Loro de la persona (direccion memoria): " + persona.getLoro());
		
		System.out.println("\n### La persona tiene al loro. 'Wiring': llamar al método @Bean loro() para obtener la referencia al bean directamente ###");
	}

}
