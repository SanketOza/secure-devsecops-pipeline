package com.sanket.securebankapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecureBankApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureBankApiApplication.class, args);

		String secret = "AWS_SECRET_ACCESS_KEY=ABCD123456789SECRET";

	}

}
