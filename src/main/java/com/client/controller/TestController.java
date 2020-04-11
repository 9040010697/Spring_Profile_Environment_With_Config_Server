package com.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/rest")
@RefreshScope
public class TestController {

	@Autowired
	private Environment env;

	@GetMapping("/getAppName")
	public ResponseEntity<String> getApplicationName(){
		String[] activeProfiles = env.getActiveProfiles();
		return ResponseEntity.ok("Environment is  "+Arrays.toString(activeProfiles)+" : "+env.getProperty("spring.application.name"));
	}


}
