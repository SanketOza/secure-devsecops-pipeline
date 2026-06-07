package com.sanket.securebankapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecureBankApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureBankApiApplication.class, args);

		String password = "SuperSecretPassword123!";
		String githubToken = "ghp_abcdefghijklmnopqrstuvwxyz1234567890";
	}

}
