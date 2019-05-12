package com.brooks.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Configuration
@Component
public class WebConfig {

	@Primary
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
