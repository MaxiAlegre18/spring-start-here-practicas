package com.aprendizaje.spring.cap4.ex1_appWithoutSpring.main;

import com.aprendizaje.spring.cap4.ex1_appWithoutSpring.model.Comment;
import com.aprendizaje.spring.cap4.ex1_appWithoutSpring.proxies.EmailCommentNotificationProxy;
import com.aprendizaje.spring.cap4.ex1_appWithoutSpring.repositories.DBCommentRepository;
import com.aprendizaje.spring.cap4.ex1_appWithoutSpring.services.CommentService;

public class Main {

	public static void main(String[] args) {
		DBCommentRepository commentRepository = new DBCommentRepository();
		EmailCommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();
		CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);
		
		Comment comment = new Comment();
		comment.setAuthor("Maxi");
		comment.setText("Comentario de prueba");
		
		commentService.publishComment(comment);
	}

}
