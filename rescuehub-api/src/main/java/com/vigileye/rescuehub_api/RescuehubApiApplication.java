package com.vigileye.rescuehub_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class RescuehubApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RescuehubApiApplication.class, args);

	}
	@EventListener(ApplicationReadyEvent.class)
	public void printLocalhost() {
		System.out.println("====================================");
		System.out.println("RescueHub API started successfully!");
		System.out.println("Local URL: http://localhost:8080");
		System.out.println("====================================");
	}

}
