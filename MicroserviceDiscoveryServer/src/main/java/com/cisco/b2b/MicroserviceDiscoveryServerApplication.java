package com.cisco.b2b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroserviceDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDiscoveryServerApplication.class, args);
	}
}
