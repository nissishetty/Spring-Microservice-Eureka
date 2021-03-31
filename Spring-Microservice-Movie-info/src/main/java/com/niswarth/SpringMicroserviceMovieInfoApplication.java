package com.niswarth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class SpringMicroserviceMovieInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroserviceMovieInfoApplication.class, args);
	}

}
