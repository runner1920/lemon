package com.lemon.sys.impl;

import org.springframework.stereotype.Service;

import com.lemon.common.service.LogService;

/**
 * 
 * @author jiangqk
 * @data 2017年9月1日 上午11:33:58
 */
@Service("logService")
public class LogServiceImpl implements LogService {

	@Override
	public String testDubbo() {
//		System.out.println(1/0);
		return "sys success";
	}
	
}
