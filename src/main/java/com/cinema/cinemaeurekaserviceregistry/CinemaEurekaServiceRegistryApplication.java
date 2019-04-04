package com.cinema.cinemaeurekaserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CinemaEurekaServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaEurekaServiceRegistryApplication.class, args);
	}

}
