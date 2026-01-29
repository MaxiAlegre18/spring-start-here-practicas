package com.aprendizaje.spring.cap3.ex6_circularReference;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		/*
		 * Este programa arroja un error porque hay una referencia circular.
		 */
	}

}
