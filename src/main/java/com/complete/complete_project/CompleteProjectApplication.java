//https://www.learncodewithdurgesh.com/blogs/jwt-authentication-with-spring-boot-31
package com.complete.complete_project;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CompleteProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompleteProjectApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
