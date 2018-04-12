package com.jcpv.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@EnableEurekaServer
@SpringBootApplication
public class SpringEurekaServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringEurekaServerApplication.class, args);

	}
}
