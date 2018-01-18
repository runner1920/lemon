package com.lemon.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 
 * @author jiangqk
 * @data 2018年1月17日 下午3:41:12
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigApplication {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigApplication.class).web(true).run(args);
	}
}
