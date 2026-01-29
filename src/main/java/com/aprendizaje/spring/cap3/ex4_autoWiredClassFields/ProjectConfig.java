package com.aprendizaje.spring.cap3.ex4_autoWiredClassFields;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*
 * Con ComponentScan, le indicamos a Spring en donde tiene que buscar las clases que debe instanciar (las que estan anotadas con @Component).
 */
@ComponentScan(basePackages = "com.aprendizaje.spring.cap3.ex4_autoWiredClassFields")
public class ProjectConfig {
	
}
