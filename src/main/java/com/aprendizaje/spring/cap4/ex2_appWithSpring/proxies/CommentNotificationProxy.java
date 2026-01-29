package com.aprendizaje.spring.cap4.ex2_appWithSpring.proxies;

import com.aprendizaje.spring.cap4.ex2_appWithSpring.model.Comment;

public interface CommentNotificationProxy {
	void sendComment(Comment comment);
}
