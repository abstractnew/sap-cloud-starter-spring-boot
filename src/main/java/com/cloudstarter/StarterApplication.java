package com.cloudstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class StarterApplication extends SpringBootServletInitializer {
	
	 @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(StarterApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);
	}
}
