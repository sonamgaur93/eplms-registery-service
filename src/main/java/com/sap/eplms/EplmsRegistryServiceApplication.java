package com.sap.eplms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EplmsRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EplmsRegistryServiceApplication.class, args);
	}

}
