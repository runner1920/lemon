package com.lemon.member.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @author jiangqk
 * @data 2018年1月5日 下午4:23:32
 */
@FeignClient("lemon-order")
public interface OrderClient {
	
	@GetMapping("/order")
	String consumer();
}
