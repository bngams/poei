package fr.vinthec.personnage.resources;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@org.springframework.context.annotation.Configuration
public class Configuration {
	@Bean
	public RestTemplate build(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	
	
}
