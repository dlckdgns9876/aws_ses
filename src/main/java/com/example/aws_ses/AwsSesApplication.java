package com.example.aws_ses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsSesApplication {
	public static void main(String[] args) {
		SpringApplication.run(AwsSesApplication.class, args);
		System.out.println("테스트");
	}
}
