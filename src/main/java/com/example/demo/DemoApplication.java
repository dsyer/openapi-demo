package com.example.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@Component
class MyJerseyConfig extends ResourceConfig {

	public MyJerseyConfig() {
		register(MyEndpoint.class);
	}

}

@Component
@Path("/")
class MyEndpoint {
	@GET
	public Model message() {
		Model hello = new Model();
		hello.setName("Hello");
		return hello;
	}
}

class Model {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}