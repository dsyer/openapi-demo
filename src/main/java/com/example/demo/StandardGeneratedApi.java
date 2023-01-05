package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.example.demo.api.GeneratedApi;
import com.example.demo.api.Model;

@Controller
public class StandardGeneratedApi implements GeneratedApi {
	@Override
	public ResponseEntity<Model> generatedGet() {
		Model model = new Model();
		model.setName("Hi");
		return ResponseEntity.ok().body(model);
	}
}
