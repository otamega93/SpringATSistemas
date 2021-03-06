package com.cursospring.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
@ComponentScan("com.cursospring.rest.servicio")
@EnableWebMvc
public class Configuracion extends WebMvcConfigurationSupport{

	@Bean
	public RequestMappingHandlerMapping defaultAnnotationHandlerMapping(){
		return new RequestMappingHandlerMapping();
	}
	
}
