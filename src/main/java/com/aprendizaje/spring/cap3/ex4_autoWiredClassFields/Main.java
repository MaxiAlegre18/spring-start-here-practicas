package com.aprendizaje.spring.cap3.ex4_autoWiredClassFields;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Persona persona = context.getBean(Persona.class);
		System.out.println("Nombre de la persona: " + persona.getNombre());
		System.out.println("Loro de la persona (direccion memoria): " + persona.getLoro());
		
		System.out.println("\n### Le indicamos a Spring que en el atributo de Loro en la clase Persona, que nos inyecte una instancia de Loro por medio de la anotacion @Autowired ###");
		System.out.println("\n### La desventaja de este metodo es que no se puede declarar la variable anotada con @Autowired como final. ###");
	}

}
