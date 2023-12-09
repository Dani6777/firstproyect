package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@GetMapping("/dojo/{mensaje}")
	public String dojo(@PathVariable String mensaje) {
		return "Dojo es " + mensaje + " !";
	}
	
	@GetMapping("/burkbank-dojo/{mensaje}")
	public String burkBank(@PathVariable String mensaje) {
		return "El Dojo Burbank está localizado al sur de " + mensaje + " !";
	}
	
	@GetMapping("/san-jose/{mensaje}")
	public String sanJose(@PathVariable String mensaje) {
		return "El Dojo "+ mensaje + " es el cuartel general";
	}

}
