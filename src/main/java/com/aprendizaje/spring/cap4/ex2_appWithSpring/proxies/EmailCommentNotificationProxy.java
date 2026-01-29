package com.aprendizaje.spring.cap4.ex2_appWithSpring.proxies;

import org.springframework.stereotype.Component;

import com.aprendizaje.spring.cap4.ex2_appWithSpring.model.Comment;

/*
 * Anotamos la clase como @Component para indicarle a Spring que debe instanciar la clase y agregar dicha instancia como bean en el context.
 */
@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending notification for comment: " + comment.getText());
	}

}
