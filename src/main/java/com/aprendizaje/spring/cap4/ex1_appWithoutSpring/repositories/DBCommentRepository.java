package com.aprendizaje.spring.cap4.ex1_appWithoutSpring.repositories;

import com.aprendizaje.spring.cap4.ex1_appWithoutSpring.model.Comment;

public class DBCommentRepository implements CommentRepository {

	@Override
	public void StoreComment(Comment comment) {
		System.out.println("Storing comment: " + comment.getText());
	}

}
