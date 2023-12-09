package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {
	
	@GetMapping("/coding")
	public String coding() {
		return " HOLA CODING DOJO";
	}
	@GetMapping("/coding/python")
	public String python() {
		return "Python/Django es mejor";
	}
	
	@GetMapping("/coding/java")
	public String java() {
		return "Java/spring es mejor";
	}
}
