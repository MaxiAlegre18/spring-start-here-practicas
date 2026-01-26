package com.aprendizaje.spring.cap4.ex1_appWithoutSpring.proxies;

import com.aprendizaje.spring.cap4.ex1_appWithoutSpring.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending notification for comment: " + comment.getText());
	}

}
