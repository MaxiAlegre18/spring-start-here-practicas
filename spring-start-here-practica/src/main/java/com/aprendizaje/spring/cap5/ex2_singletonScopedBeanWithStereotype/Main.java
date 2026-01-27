package com.aprendizaje.spring.cap5.ex2_singletonScopedBeanWithStereotype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		CommentService s1 = context.getBean(CommentService.class);
		UserService s2 = context.getBean(UserService.class);
		
		/*
		 * Considera un diseño de clases donde dos servicios dependen de un repositorio, uno de esos servicios es CommentService
		 * y el otro es UserService. Ambos dependen del repositorio CommentRepository. En sus atributos tienen un CommentRepository.
		 * 
		 * s1 y s2 fueron inyectadas con la misma instancia de CommentRepository probando nuevamente que el patron
		 * por default de Spring es Singleton (una instancia del mismo nombre y tipo).
		 * 
		 * OBSERVACION 1:
		 * En un escenario real, las aplicaciones se ejecutan en multi-hilo y podria ocurrir, que simultaneamente, ambas clases
		 * cambien los atributos tanto como propias o como las del bean CommentRepository, si esto pasa y no hay una sincronizacion oportuna,
		 * podria ocurrir un escenario de CONDICION DE CARRERA, por lo tantno, se sugiere usar SINGLETON para escenarios donde los
		 * beans no puedan MUTAR los atributos (aplica para cualquier clase que pueda mutar sus atributos).
		 * 
		 * OBSERVACION 2 (EAGER-LAZY):
		 * Por defecto, Spring crea todos los Singleton BEANS al inicializar el Spring Context. Sin embargo, si se quisiese crear
		 * un Bean solamente cuando es llamado, se puede marcar a la clase que se va a instanciar como @Lazy
		 */
		
		boolean sameCommentRepository = s1.getCommentRepository() == s2.getCommentRepository();
		
		System.out.println(sameCommentRepository);
	}

}
