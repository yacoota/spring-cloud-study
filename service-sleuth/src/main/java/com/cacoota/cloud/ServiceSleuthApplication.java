package com.cacoota.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinStreamServer
@Deprecated
public class ServiceSleuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceSleuthApplication.class, args);
	}
}
