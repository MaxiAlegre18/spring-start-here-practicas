package com.aprendizaje.spring.cap6.ex2_interceptParameters.services;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.aprendizaje.spring.cap6.ex2_interceptParameters.model.Comment;

/*
 * Declaramos la clase como servicio para que Spring cree instancias de esta clase.
 */
@Service
public class CommentService {
	
	/*
	 * Creamos un objeto Logger para que pueda dejar un "log" en la consola de la aplicacion cada vez que se use
	 * el metodo publishComment()
	 */
	private Logger logger = Logger.getLogger(CommentService.class.getName());
	
	/*
	 * Este metodo es la implementacion del caso de uso.
	 */
	public String publishComment(Comment comment) {
		logger.info("Publishing comment: " + comment.getText());
		return "SUCESS";
	}
	
}
