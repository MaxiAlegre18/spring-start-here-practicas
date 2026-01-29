package com.aprendizaje.spring.cap2.addBeanWithAnnotation1.config;

import org.springframework.context.annotation.Bean;

import com.aprendizaje.spring.cap2.addBeanWithAnnotation1.main.Loro;

public class ProjectConfig {

	@Bean
	Loro loro() {
		Loro l = new Loro();
		l.setNombre("Lorenzo");
		return l;
	}
}
