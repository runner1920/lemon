package com.lemon.member;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 
 * @author jiangqk
 * @data 2017年11月29日 下午4:30:14
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class MemberApplication {
	
	public static void main(String[] args) {
        new SpringApplicationBuilder(MemberApplication.class)
                    .web(true).run(args);
    }
	
}
