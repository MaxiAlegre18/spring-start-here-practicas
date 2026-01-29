package com.aprendizaje.spring.cap5.ex3_prototypeScopedBeanWithAnnotation;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {
	
	/*
	 * SCOPE_PROTOTYPE marca el Bean de tipo PROTOTYPE, es decir, cada vez que se llame al metodo commentService(), Spring
	 * context devolvera un bean nuevo.
	 */
	@Bean
	@Scope(BeanDefinition.SCOPE_PROTOTYPE)
	public CommentService commentService() {
		return new CommentService();
	}
}
