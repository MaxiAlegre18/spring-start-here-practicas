package com.aprendizaje.spring.cap4.ex2_appWithSpring.repositories;

import org.springframework.stereotype.Component;

import com.aprendizaje.spring.cap4.ex2_appWithSpring.model.Comment;

/*
 * Anotamos la clase como @Component para indicarle a Spring que debe instanciar la clase y agregar dicha instancia como bean en el context.
 */
@Component
public class DBCommentRepository implements CommentRepository {

	@Override
	public void StoreComment(Comment comment) {
		System.out.println("Storing comment: " + comment.getText());
	}

}
