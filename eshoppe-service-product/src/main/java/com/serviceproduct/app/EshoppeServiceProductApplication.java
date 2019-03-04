package com.serviceproduct.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//	Add the exclude parameter to prevent Spring Hateoas from auto-configuring a REST end-point for your entities
@SpringBootApplication(exclude = RepositoryRestMvcAutoConfiguration.class)
@EnableEurekaClient		//	Enable eureka client. It inherits from @EnableDiscoveryClient
public class EshoppeServiceProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(EshoppeServiceProductApplication.class, args);
		System.out.println(">>> Product service starting...");
	}

}
