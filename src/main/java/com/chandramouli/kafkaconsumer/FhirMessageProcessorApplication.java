package com.chandramouli.kafkaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FhirMessageProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FhirMessageProcessorApplication.class, args);
	}

}
