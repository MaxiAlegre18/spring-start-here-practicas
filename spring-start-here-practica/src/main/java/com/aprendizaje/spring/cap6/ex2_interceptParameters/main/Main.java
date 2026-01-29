package com.aprendizaje.spring.cap6.ex2_interceptParameters.main;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aprendizaje.spring.cap6.ex2_interceptParameters.config.ProjectConfig;
import com.aprendizaje.spring.cap6.ex2_interceptParameters.model.Comment;
import com.aprendizaje.spring.cap6.ex2_interceptParameters.services.CommentService;

public class Main {
	
	private static Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		CommentService service = context.getBean(CommentService.class);
		
		/*
		 * ALTERAR PARAMETROS DEL METODO INTERCEPTADO.
		 * 
		 * Supongamos que ahora quiero mostrar en el log los parametros usados en el metodo service y luego mostrar en el log que
		 * retornó.
		 */
		
		Comment comment = new Comment();
		comment.setAuthor("Maxi Alegre");
		comment.setText("Comentario demo desde ejemplo 2.");
		
		String value = service.publishComment(comment);
		
		logger.info(value);
	}

}
