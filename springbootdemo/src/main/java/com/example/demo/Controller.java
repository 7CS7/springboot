package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller

public class Controller {
	@RequestMapping("/")
	@ResponseBody
public String about() {
	return "demo spring boot";
}
}
