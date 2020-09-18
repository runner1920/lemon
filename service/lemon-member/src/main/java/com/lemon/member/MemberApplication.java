package com.lemon.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 * @author jiangqk
 * @data 2017年11月29日 下午4:30:14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MemberApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }
	
}
