package com.lemon;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author jiangqk
 * @data 2018年1月5日 下午3:18:00
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
	
	public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaApplication.class)
                    .web(true).run(args);
    }
}
