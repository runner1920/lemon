package com.lemon.task;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 
 * @author jiangqk
 * @data 2017年9月4日 上午11:23:47
 */
@SpringBootApplication
@EnableScheduling
@MapperScan(basePackages="com.lemon.task.dao")
public class TaskApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(TaskApplication.class);
		app.run(args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(TaskApplication.class);
	}

}
