package com.gatewayapi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient 		// It acts as a eureka client
@EnableZuulProxy			// Enable Netflix Zuul configuration
public class EshoppeGatewayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EshoppeGatewayApiApplication.class, args);
		System.out.println(">>> Starting gateway api...");
	}

}
