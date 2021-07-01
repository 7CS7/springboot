package bootudemy.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MyExample {

	@RequestMapping("/home")
	public String show() {
		return "welcome to the java world";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SpringApplication.run(MyExample.class,args);
	}

}
