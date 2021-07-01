package com.cs.springbootudemythymlyfcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/")
public String home() {
	return "Heelo Welcome!";
}
}
