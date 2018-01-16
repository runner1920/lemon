package com.lemon.product;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author jiangqk
 * @data 2018年1月16日 下午3:58:02
 */
@SpringBootApplication
@ComponentScan(value="com.lemon")
public class ProductApplication {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(ProductApplication.class).web(true).run(args);
	}
}
