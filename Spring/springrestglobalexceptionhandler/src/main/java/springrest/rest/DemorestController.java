package springrest.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemorestController {
@GetMapping("/hello")
public String sayHello() {
	return "Hello Programmer Whasssup!!!";
}
}
