package com.example.springDemo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SpringDemoController {

	@GetMapping("/")
	public String helloSpringDemo() {
		return "Hello FEGO Demo!";
	}
}
