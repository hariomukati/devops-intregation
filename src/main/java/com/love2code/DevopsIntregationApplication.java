package com.love2code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntregationApplication {
	
	@GetMapping
	public String message() {
		return "Welcome to Feel2Code";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsIntregationApplication.class, args);
	}

}
