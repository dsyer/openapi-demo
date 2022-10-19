package com.example.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class MyJerseyConfig extends ResourceConfig {

	public MyJerseyConfig() {
		register(MyEndpoint.class);
	}

}