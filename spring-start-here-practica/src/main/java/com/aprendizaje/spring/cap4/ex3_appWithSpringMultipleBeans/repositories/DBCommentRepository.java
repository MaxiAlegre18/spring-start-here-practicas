package com.aprendizaje.spring.cap4.ex3_appWithSpringMultipleBeans.repositories;

import org.springframework.stereotype.Repository;

import com.aprendizaje.spring.cap4.ex3_appWithSpringMultipleBeans.model.Comment;

/*
 * Anotamos la clase como @Repository para marcarla como un componente que implementa la responsabilidad de repositorio
 * y para indicarle a Spring que debe instanciar la clase y agregar dicha instancia como bean en el context.
 */
@Repository
public class DBCommentRepository implements CommentRepository {

	@Override
	public void StoreComment(Comment comment) {
		System.out.println("Storing comment: " + comment.getText());
	}

}
