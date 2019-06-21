package com.wdperu.apirestHoteles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@SpringBootApplication
public class ApirestHotelesApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ApirestHotelesApplication.class, args);
	}
	

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApirestHotelesApplication.class);
	}

}
