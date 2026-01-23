package com.aprendizaje.spring.cap2.addMultipleBeansWithAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

	@Bean
	Loro loro1() {
		Loro l = new Loro();
		l.setNombre("Lorenzo");
		return l;
	}
	
	@Bean
	Loro loro2() {
		Loro l = new Loro();
		l.setNombre("Lola");
		return l;
	}
	
	@Bean
	Loro loro3() {
		Loro l = new Loro();
		l.setNombre("Kiki");
		return l;
	}
}
