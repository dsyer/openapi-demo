package com.example.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

import io.swagger.annotations.Api;

@Component
@Path("/")
@Api(description = "the manual API")
public class MyEndpoint {
	@GET
	@Produces({ "application/json" })
	public Model message() {
		Model hello = new Model();
		hello.setName("Hello");
		return hello;
	}
}