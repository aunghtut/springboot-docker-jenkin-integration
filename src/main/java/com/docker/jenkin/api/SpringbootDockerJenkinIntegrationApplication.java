package com.docker.jenkin.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerJenkinIntegrationApplication {
	
	@GetMapping("/")
	public String hello() {
		return "springboot jenkins docker integration";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerJenkinIntegrationApplication.class, args);
	}

}
