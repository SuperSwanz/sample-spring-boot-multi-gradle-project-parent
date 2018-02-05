package com.sample.rest.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages = { "com.sample.rest" })
@EnableConfigurationProperties
@EnableAutoConfiguration
public class Runner {
	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
	}
}