package com.aprendizaje.spring.cap4.ex3_appWithSpringMultipleBeans.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.aprendizaje.spring.cap4.ex3_appWithSpringMultipleBeans.model.Comment;
import com.aprendizaje.spring.cap4.ex3_appWithSpringMultipleBeans.proxies.CommentNotificationProxy;
import com.aprendizaje.spring.cap4.ex3_appWithSpringMultipleBeans.repositories.CommentRepository;

/*
 * Anotamos la clase como @Service para marcar a este @Component con rol de servicio (implementa un caso de uso) y
 * para indicarle a Spring que debe instanciar la clase y agregar dicha instancia como bean en el context.
 */
@Service
public class CommentService {
	private final CommentRepository commentRepository;
	private final CommentNotificationProxy commentNotificationProxy;
	
	/*
	 * Declaramos que el constructor CommentService depende de otros dos componentes.
	 * Spring es inteligente e identifica que ambos parametros son interfaces y buscará clases que implementen esas interfaces
	 * para inyectar la dependencia.
	 * 
	 * Como aclaración extra, la anotación @Autowired en este caso, cuando el constructor es uno solo, es opcional.
	 * 
	 * Le indicamos a Spring con la anotacion @Qualifier que queremos usar la implementacion de PUSH.
	 */
	@Autowired
	public CommentService(CommentRepository commentRepository, @Qualifier("PUSH")CommentNotificationProxy commentNotificationProxy) {
		this.commentRepository = commentRepository;
		this.commentNotificationProxy = commentNotificationProxy;
	}
	
	public void publishComment(Comment comment) {
		commentRepository.StoreComment(comment);
		commentNotificationProxy.sendComment(comment);
	}
	
}
