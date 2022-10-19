package com.example.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

@Component
public class MyJerseyConfig extends ResourceConfig {

	public MyJerseyConfig() {
		register(MyEndpoint.class);
		packages("io.swagger.jaxrs.listing",
		"com.example.demo");
		register(ApiListingResource.class);
		register(SwaggerSerializers.class);
	}

}