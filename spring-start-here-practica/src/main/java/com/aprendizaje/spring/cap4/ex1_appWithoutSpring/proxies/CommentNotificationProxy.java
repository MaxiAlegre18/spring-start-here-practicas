package com.aprendizaje.spring.cap4.ex1_appWithoutSpring.proxies;

import com.aprendizaje.spring.cap4.ex1_appWithoutSpring.model.Comment;

public interface CommentNotificationProxy {
	void sendComment(Comment comment);
}
