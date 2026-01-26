package com.aprendizaje.spring.cap4.ex3_appWithSpringMultipleBeans.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.aprendizaje.spring.cap4.ex3_appWithSpringMultipleBeans.proxies",
								"com.aprendizaje.spring.cap4.ex3_appWithSpringMultipleBeans.repositories",
								"com.aprendizaje.spring.cap4.ex3_appWithSpringMultipleBeans.services"})
public class ProjectConfig {

}
