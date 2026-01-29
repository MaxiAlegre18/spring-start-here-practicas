package com.aprendizaje.spring.cap2.addMultipleBeansWithAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		/*
		 * 
		 * Loro l = context.getBean(Loro.class);
		 * 
		 * 
		 * Ocurre un error: No qualifying bean of type
		 * available: expected single matching bean but found 3: loro1,loro2,loro3
		 */
		
		
		/*
		 * De esta manera, se especifica el nombre del bean que se desea buscar
		 */
		Loro l = context.getBean("loro2", Loro.class);
		System.out.println(l.getNombre());
		
		/*
		 * También se pueden generar instancias de clases ya existentes de Java.
		 */
		String str = context.getBean("string1", String.class);
		System.out.println(str);

	}

}
