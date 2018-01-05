package com.lemon.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;



/**
 * 
 * @author jiangqk
 * @data 2017年8月30日 下午4:53:06
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(OrderApplication.class).web(true).run(args);
	}
	
}
