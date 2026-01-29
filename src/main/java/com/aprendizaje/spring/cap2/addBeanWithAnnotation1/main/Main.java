package com.aprendizaje.spring.cap2.addBeanWithAnnotation1.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aprendizaje.spring.cap2.addBeanWithAnnotation1.config.ProjectConfig;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Loro l = context.getBean(Loro.class);
		
		System.out.println("El nombre del loro (bean en Spring context) es: " + l.getNombre());
	}

}
