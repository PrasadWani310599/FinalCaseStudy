package com.example.AgricultureEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AgricultureEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgricultureEurekaApplication.class, args);
	}

}
