package com.aprendizaje.spring.cap5.ex3_prototypeScopedBeanWithAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		CommentService c1 = context.getBean("commentService", CommentService.class);
		CommentService c2 = context.getBean("commentService", CommentService.class);
		
		/*
		 * PROTOTYPE SCOPED BEAN.
		 * c1 y c2 reciben referencias a beans DISTINTOS del tipo CommentService. Por lo tanto, c1 == c2 sera falso.
		 */
		System.out.println(c1 == c2);
	}

}
