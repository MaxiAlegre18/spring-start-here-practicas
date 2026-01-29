package com.aprendizaje.spring.cap4.ex3_appWithSpringMultipleBeans.proxies;

import com.aprendizaje.spring.cap4.ex3_appWithSpringMultipleBeans.model.Comment;

public interface CommentNotificationProxy {
	void sendComment(Comment comment);
}
