package com.cs.springbootudemy.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@Value("${coach.name}")
	private String coachName;
	@Value("${coach.team}")
	private String teamName;
	@GetMapping("teamInfo")
	public String teamInfo() {
		return coachName+" "+teamName;
	}
	
@GetMapping("/")
	public String sayHello() {
		return "Hello dev current time is "+LocalDateTime.now();
	}
@GetMapping("home")
public String home() {
	return "Welcome to the Home page";
}
}
