package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllers {

	@GetMapping("/")
	public String home() {
		return ("<h1> Welcome to Home </h1>");
	}
	
	@GetMapping("/user")
	public String user() {
		return ("<h1> Welcome user to Home </h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1> Welcome admin to Home </h1>");
	}
}
