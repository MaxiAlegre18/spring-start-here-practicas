package com.aprendizaje.spring.cap5.ex1_singletonScopedBeanWithAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
	
	@Bean
	public CommentService commentService() {
		return new CommentService();
	}
}
