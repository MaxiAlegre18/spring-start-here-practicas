package com.aprendizaje.spring.cap4.ex3_appWithSpringMultipleBeans.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aprendizaje.spring.cap4.ex3_appWithSpringMultipleBeans.config.ProjectConfig;
import com.aprendizaje.spring.cap4.ex3_appWithSpringMultipleBeans.model.Comment;
import com.aprendizaje.spring.cap4.ex3_appWithSpringMultipleBeans.services.CommentService;
;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Comment comment = new Comment();
		comment.setAuthor("Maxi Alegre");
		comment.setText("Comentario demo de Spring context.");
		
		CommentService commentService = context.getBean(CommentService.class);
		commentService.publishComment(comment);
	}

}
