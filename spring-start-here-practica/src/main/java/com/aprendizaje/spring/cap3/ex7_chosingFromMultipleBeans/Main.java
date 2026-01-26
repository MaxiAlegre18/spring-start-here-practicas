package com.aprendizaje.spring.cap3.ex7_chosingFromMultipleBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Persona persona = context.getBean(Persona.class);
		System.out.println("Nombre de la persona: " + persona.getNombre());
		System.out.println("Loro de la persona (direccion memoria): " + persona.getLoro());
		
		System.out.println("\n### Wiring manualmente con multiples beans, resolviendo ambiguedad con @Qualifier ###");
	}

}
