package com.api1MobileProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Api1MobileProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Api1MobileProjectApplication.class, args);
	}
	@Bean
	@LoadBalanced
	public RestTemplate getTemp() {
		return new RestTemplate();
	}
}
