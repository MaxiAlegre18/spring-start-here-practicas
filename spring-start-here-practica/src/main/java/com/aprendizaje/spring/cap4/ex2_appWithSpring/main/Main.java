package com.aprendizaje.spring.cap4.ex2_appWithSpring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aprendizaje.spring.cap4.ex2_appWithSpring.config.ProjectConfig;
import com.aprendizaje.spring.cap4.ex2_appWithSpring.model.Comment;
import com.aprendizaje.spring.cap4.ex2_appWithSpring.services.CommentService;
;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Comment comment = new Comment();
		comment.setAuthor("Maxi Alegre");
		comment.setText("Comentario de prueba de Spring.");
		
		CommentService commentService = context.getBean(CommentService.class);
		commentService.publishComment(comment);
	}

}
