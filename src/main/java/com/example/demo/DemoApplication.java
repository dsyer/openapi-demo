package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.example.demo.api.Bootstrap;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	ServletRegistrationBean<Bootstrap> bootstrap() {
		ServletRegistrationBean<Bootstrap> registration = new ServletRegistrationBean<Bootstrap>(new Bootstrap(), "/bootstrap");
		registration.setLoadOnStartup(2);
		return registration;
	}

}