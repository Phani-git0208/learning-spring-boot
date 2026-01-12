package com.phain.springlerning.learningspringbootapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningspringbootappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LearningspringbootappApplication.class, args);
	}

	private payment paymentObjectStoredInsideClass;

	public LearningspringbootappApplication(payment paymentObjectPassedIntoConstructor) {
		this.paymentObjectStoredInsideClass = paymentObjectPassedIntoConstructor;
	}


	@Override
	public void run(String... args)throws Exception{
		paymentObjectStoredInsideClass.pay();

			}
}
