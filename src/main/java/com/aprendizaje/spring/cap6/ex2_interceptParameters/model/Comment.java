package com.aprendizaje.spring.cap6.ex2_interceptParameters.model;

public class Comment {
	private String text;
	private String author;
	
	public String getText() {
		return text;
	}
	
	@Override
	public String toString() {
		return "Comment [text=" + text + ", author=" + author + "]";
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
