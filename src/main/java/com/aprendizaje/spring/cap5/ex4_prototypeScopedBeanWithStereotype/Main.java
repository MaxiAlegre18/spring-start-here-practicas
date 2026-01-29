package com.aprendizaje.spring.cap5.ex4_prototypeScopedBeanWithStereotype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		CommentService s1 = context.getBean(CommentService.class);
		UserService s2 = context.getBean(UserService.class);
		
		/*
		 * PROTOTYPE SCOPED BEAN.
		 * s1 y s2 reciben referencias a beans DISTINTOS del tipo CommentRepository (pues es un bean prototype). Por lo tanto, c1 == c2 sera falso.
		 */
		boolean isIdenticalCommentRepository = s1.getCommentRepository() == s2.getCommentRepository();
		
		System.out.println(isIdenticalCommentRepository);
	}

}
