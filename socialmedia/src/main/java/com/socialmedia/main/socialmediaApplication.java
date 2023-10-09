package com.socialmedia.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		info =@Info(
				title = "Social media",
				version = "1.1.2",
				description = "App Description",
				contact = @Contact(
						name = "Abi",
						email = "user Email"
						)
				)
		)

@SpringBootApplication
public class socialmediaApplication {

	public static void main(String[] args) {
		SpringApplication.run(socialmediaApplication.class, args);
	}

}
