package com.aprendizaje.spring.cap2.addBeanWithStereotype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Loro l = context.getBean(Loro.class);
		System.out.println("La instancia(bean) esta en el context: ");
		System.out.println(l);
		
		System.out.println("\nImprime Null pues aún no se le asignó un nombre al loro");
		System.out.println(l.getNombre());
		
		l.setNombre("Kiki");
		
		System.out.println("\nLuego de asignar el nombre:");
		System.out.println(l.getNombre());

	}

}
