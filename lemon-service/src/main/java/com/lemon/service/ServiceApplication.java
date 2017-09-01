package com.lemon.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;



/**
 * 
 * @author jiangqk
 * @data 2017年8月30日 下午4:53:06
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo.xml"})
@MapperScan("com.lemon.service.dao")
public class ServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ServiceApplication.class);
		app.run(args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(ServiceApplication.class);
	}
	
}
