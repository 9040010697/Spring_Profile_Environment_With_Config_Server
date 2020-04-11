package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.core.env.AbstractEnvironment;

@SpringBootApplication
@EnableAutoConfiguration
public class TestClientApplication {
	public static void main(String[] args) {
		//-Dspring.profiles.active=dev
		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME,"test");
		SpringApplication.run(TestClientApplication.class, args);
	}
}
