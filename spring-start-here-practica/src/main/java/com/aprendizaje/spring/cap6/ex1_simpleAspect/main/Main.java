package com.aprendizaje.spring.cap6.ex1_simpleAspect.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aprendizaje.spring.cap6.ex1_simpleAspect.config.ProjectConfig;
import com.aprendizaje.spring.cap6.ex1_simpleAspect.model.Comment;
import com.aprendizaje.spring.cap6.ex1_simpleAspect.services.CommentService;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		CommentService service = context.getBean(CommentService.class);
		
		/*
		 * Para crear un aspecto, seguimos los siguientes pasos.
		 * 	1. Activamos los aspectos en nuestra aplicacion Spring usando la @EnableAspectJAutoProxy annotation, declarandola
		 * en la clase ProjectConfig relacionada con la configuracion de la applicacion.
		 * 
		 * 	2. Creamos una nueva clase anotandola con @Aspect, luego, usando @Bean
		 * o stereotype annotations, añadimos un bean de esa clase al context.
		 * 
		 * 	3. Definimos el metodo que va a ejecutar la logica del aspecto y luego que metodos va a interceptar.
		 * 
		 * 	4. Implementamos la logica del aspecto
		 */
		
		Comment comment = new Comment();
		comment.setAuthor("Maxi Alegre");
		comment.setText("Comentario demo.");
		
		service.publishComment(comment);

	}

}
