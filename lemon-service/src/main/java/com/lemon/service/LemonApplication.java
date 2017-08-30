package com.lemon.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;



/**
 * 
 * @author jiangqk
 * @data 2017年8月30日 下午4:53:06
 */
@SpringBootApplication
public class LemonApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(LemonApplication.class);
		app.run(args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(LemonApplication.class);
	}
	
}
