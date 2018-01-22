package com.lemon.rabbit;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 
 * @author jiangqk
 * @data 2018年1月18日 下午5:16:38
 */
@SpringBootApplication
public class RabbitApplication {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(RabbitApplication.class).web(true).run(args);
	}
}
