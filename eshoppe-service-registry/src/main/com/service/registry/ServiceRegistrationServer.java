package com.service.registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistrationServer {
	
	private static final Logger log = LoggerFactory.getLogger(ServiceRegistrationServer.class);

	/**
	 * By default Spring Boot applications look for an 'application.properties' or
	 * 'application.yml' file for configuration. By setting the spring.config.name
	 * property we can tell Spring Boot to look for a different file.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Tell Boot to look for registration-server.yml
		System.setProperty("spring.config.name", "registration-server");
		SpringApplication.run(ServiceRegistrationServer.class, args);
		log.info(">>> Starting registry service...");
	}

}
