package com.lemon.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author jiangqk
 * @data 2018年1月5日 下午4:21:34
 */
@RefreshScope
@RestController
public class OrderController {
	
	@Autowired
    DiscoveryClient discoveryClient;
	
	@Value("${lemon.test}")
	private String message;
	
	@GetMapping("/order")
	public String execute() throws InterruptedException {
		return discoveryClient.getServices().toString();
	}
	
	@GetMapping("/testgit")
	public String execute2() {
		return message;
	}
	
}
