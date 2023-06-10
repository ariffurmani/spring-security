package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllers {

	@GetMapping("/")
	public String home() {
		return ("<h1> Welcome to Home </h1>");
	}
}
