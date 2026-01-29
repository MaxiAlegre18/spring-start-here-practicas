package com.aprendizaje.spring.cap3.ex5_autoWiredConstructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Persona persona = context.getBean(Persona.class);
		System.out.println("Nombre de la persona: " + persona.getNombre());
		System.out.println("Loro de la persona (direccion memoria): " + persona.getLoro());
		
		System.out.println("\n### Le indicamos a Spring que cuando cree un bean del tipo Persona, que nos inyecte una instancia de Loro. ###");
		System.out.println("\n### De esta manera, utilizando @Autowired en el constructor, podemos marcar el atributo como final. ###");
	}

}
