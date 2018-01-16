package com.lemon.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lemon.member.client.OrderClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * 
 * @author jiangqk
 * @data 2018年1月8日 上午11:51:53
 */
@Service
public class MemberServiceImpl {
	
	@Autowired
	private OrderClient orderClient;
	
	@HystrixCommand(fallbackMethod="fallback")
	public String consumer() {
		return orderClient.consumer();
	}
	
	public String fallback() {
		return "fallbakc";
	}
}
