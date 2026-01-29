package com.aprendizaje.spring.cap4.ex2_appWithSpring.model;

/*
 * Esto es una clase POJO (Plain Old Java Object), es decir, es un objeto de Java simple sin dependencias de frameworks especificos. Simplemente
 * descrita por sus atributos y métodos.
 */

public class Comment {
	private String author;
	private String text;
	
	public Comment() {
		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
