package com.aprendizaje.spring.cap6.ex3_interceptAnnotatedMethods.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.aprendizaje.spring.cap6.ex3_interceptAnnotatedMethods.aspects.LoggingAspect;

@Configuration
@ComponentScan(basePackages = "com.aprendizaje.spring.cap6.ex3_interceptAnnotatedMethods")
/*
 * PASO 1 DE LA IMPLEMENTACION DE ASPECTOS: Activamos los aspectos en nuestra aplicacion de Spring. 
 */
@EnableAspectJAutoProxy
public class ProjectConfig {

	/*
	 * PASO 2.2 DE LA IMPLEMENTACION DE ASPECTOS: Agregamos una instancia de la clase del aspecto al Spring Context.
	 */
	
	@Bean
	public LoggingAspect logAspect() {
		return new LoggingAspect();
	}
}
