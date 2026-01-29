package com.aprendizaje.spring.cap4.ex3_appWithSpringMultipleBeans.proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.aprendizaje.spring.cap4.ex3_appWithSpringMultipleBeans.model.Comment;

/*
 * Anotamos la clase como @Component para indicarle a Spring que debe instanciar la clase y agregar dicha instancia como bean en el context.
 * Cuando Spring no nos provee una anotacion apropiada, la anotamos como @Component (y no con @Service, @Repository, etc).
 * 
 * Usando la anotacion @Qualifier, nombramos a esta implementacion como EMAIL.
 */
@Component
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending notification for comment: " + comment.getText());
	}

}
