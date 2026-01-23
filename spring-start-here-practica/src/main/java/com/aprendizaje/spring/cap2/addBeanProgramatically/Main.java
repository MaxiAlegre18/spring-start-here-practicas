package com.aprendizaje.spring.cap2.addBeanProgramatically;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		/*
		 * La clase loro ya no esta marcada como @Component y la clase ProjectConfig no esta marcada como @Configuration
		 * pues ahora los beans los registramos manualmente.
		 */
		Loro l = new Loro();
		l.setNombre("Kiki");
		
		Supplier<Loro> loroSupplier = () -> l;
		
		context.registerBean("loro1", Loro.class, loroSupplier);
		
		Loro p = context.getBean(Loro.class);
		System.out.println("El nombre del loro1 (bean) es: " + p.getNombre());
	}

}
