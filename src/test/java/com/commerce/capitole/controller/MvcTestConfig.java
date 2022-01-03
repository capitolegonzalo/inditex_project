package com.commerce.capitole.controller;

import java.util.TimeZone;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@EnableConfigurationProperties
public class MvcTestConfig {
	
	@Bean(name = "jacksonObjectMapper") 
	@Profile("test")
	com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper() {
		com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
		mapper.setTimeZone(TimeZone.getDefault());
		return mapper;
	}
	
    @Bean
    @Profile("test")
    public MappingJackson2HttpMessageConverter converter() {
    	return new MappingJackson2HttpMessageConverter(jacksonObjectMapper());
    }
}
