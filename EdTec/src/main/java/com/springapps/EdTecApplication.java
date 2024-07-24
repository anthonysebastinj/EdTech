package com.springapps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.springapps.edtech")
public class EdTecApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdTecApplication.class, args);
	}

}
