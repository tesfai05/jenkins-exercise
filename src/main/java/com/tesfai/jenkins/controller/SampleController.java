package com.tesfai.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/")
	public String sampleMethod() {
		return "Jenkins work fine";
	}
	@GetMapping("/welcome/{name}")
	public String welcomeMethod(@PathVariable String name) {
		return name+", Welcome to Jenkins tutorial !";
	}

}
