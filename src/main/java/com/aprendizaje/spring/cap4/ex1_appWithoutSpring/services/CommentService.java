package com.aprendizaje.spring.cap4.ex1_appWithoutSpring.services;

import com.aprendizaje.spring.cap4.ex1_appWithoutSpring.model.Comment;
import com.aprendizaje.spring.cap4.ex1_appWithoutSpring.proxies.CommentNotificationProxy;
import com.aprendizaje.spring.cap4.ex1_appWithoutSpring.repositories.CommentRepository;

public class CommentService {
	private final CommentRepository commentRepository;
	private final CommentNotificationProxy commentNotificationProxy;
	
	public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
		this.commentRepository = commentRepository;
		this.commentNotificationProxy = commentNotificationProxy;
	}
	
	public void publishComment(Comment comment) {
		commentRepository.StoreComment(comment);
		commentNotificationProxy.sendComment(comment);
	}
	
}
