package com.aprendizaje.spring.cap5.ex4_prototypeScopedBeanWithStereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
	
	/*
	 * Le indicamos a Spring que nos inyecte un bean del tipo CommentRepository, como esa clase esta marcada como Prototype Scope,
	 * nos dara un bean nuevo de ese tipo.
	 */
	@Autowired
	private CommentRepository commentRepository;

	public CommentRepository getCommentRepository() {
		return commentRepository;
	}

}
