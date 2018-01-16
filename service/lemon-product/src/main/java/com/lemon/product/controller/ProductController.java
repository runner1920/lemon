package com.lemon.product.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lemon.common.util.R;

/**
 * 
 * @author jiangqk
 * @data 2018年1月16日 下午4:06:42
 */
@RestController
@RequestMapping("/product")
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@RequestMapping("/ec")
	public R execute() {
		logger.info("asdf");
		System.out.println(1/0);
		return R.ok();
	}
}
