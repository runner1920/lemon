package com.lemon.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author jiangqk
 * @data 2018年1月5日 下午4:21:34
 */
@RestController
public class OrderController {
	
	@Autowired
    DiscoveryClient discoveryClient;
	
	@GetMapping("/order")
	public String execute() throws InterruptedException {
		return discoveryClient.getServices().toString();
	}
	
}
