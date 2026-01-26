package com.aprendizaje.spring.cap4.ex2_appWithSpring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.aprendizaje.spring.cap4.ex2_appWithSpring.proxies",
								"com.aprendizaje.spring.cap4.ex2_appWithSpring.repositories",
								"com.aprendizaje.spring.cap4.ex2_appWithSpring.services"})
public class ProjectConfig {

}
