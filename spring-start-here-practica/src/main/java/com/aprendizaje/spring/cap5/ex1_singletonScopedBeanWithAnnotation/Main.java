package com.aprendizaje.spring.cap5.ex1_singletonScopedBeanWithAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		CommentService c1 = context.getBean("commentService", CommentService.class);
		CommentService c2 = context.getBean("commentService", CommentService.class);
		
		/*
		 * c1 y c2 recibieron la misma referencia al mismo bean de commentService dado que por defecto,
		 * Spring se comporta de manera Singleton con las instancias de las clases, es decir,
		 * cada instancia tiene un nombre único y un tipo. Siempre que se obtendra la misma instancia si se utiliza
		 * el mismo nombre (bean ID) para obtenerla.
		 */
		System.out.println(c1 == c2);
	}

}
