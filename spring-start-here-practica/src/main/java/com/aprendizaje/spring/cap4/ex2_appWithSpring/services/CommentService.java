package com.aprendizaje.spring.cap4.ex2_appWithSpring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aprendizaje.spring.cap4.ex2_appWithSpring.model.Comment;
import com.aprendizaje.spring.cap4.ex2_appWithSpring.proxies.CommentNotificationProxy;
import com.aprendizaje.spring.cap4.ex2_appWithSpring.repositories.CommentRepository;

/*
 * Anotamos la clase como @Component para indicarle a Spring que debe instanciar la clase y agregar dicha instancia como bean en el context.
 */
@Component
public class CommentService {
	private final CommentRepository commentRepository;
	private final CommentNotificationProxy commentNotificationProxy;
	
	/*
	 * Declaramos que el constructor CommentService depende de otros dos componentes.
	 * Spring es inteligente e identifica que ambos parametros son interfaces y buscará clases que implementen esas interfaces
	 * para inyectar la dependencia.
	 * 
	 * Como aclaración extra, la anotación @Autowired en este caso, cuando el constructor es uno solo, es opcional.
	 */
	@Autowired
	public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
		this.commentRepository = commentRepository;
		this.commentNotificationProxy = commentNotificationProxy;
	}
	
	public void publishComment(Comment comment) {
		commentRepository.StoreComment(comment);
		commentNotificationProxy.sendComment(comment);
	}
	
}
