package com.example.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CicdApplication {

	@GetMapping
	public String message(){
        return "Hello World";
    }

	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

}
