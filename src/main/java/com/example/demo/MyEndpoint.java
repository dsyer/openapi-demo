package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/manual")
public class MyEndpoint {
	@GetMapping(produces = "application/json")
	public Model message() {
		Model hello = new Model();
		hello.setName("Hello");
		return hello;
	}
}