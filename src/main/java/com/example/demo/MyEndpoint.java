package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/manual")
@Tag(name = "manual", description = "the manual API")
public class MyEndpoint {
	@GetMapping(produces = "application/json")
	@Operation
	public Model message() {
		Model hello = new Model();
		hello.setName("Hello");
		return hello;
	}
}