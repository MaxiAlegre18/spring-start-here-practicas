package com.aprendizaje.spring.cap5.ex2_singletonScopedBeanWithStereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	/*
	 * Le indicamos a Spring que nos inyecte una instancia del tipo CommentRepository
	 */
	@Autowired
	private CommentRepository commentRepository;
	
	public CommentRepository getCommentRepository() {
		return this.commentRepository;
	}
}
