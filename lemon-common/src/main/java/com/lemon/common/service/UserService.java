package com.lemon.common.service;

import com.lemon.common.model.UserDO;

/**
 * 
 * @author jiangqk
 * @data 2017年8月30日 下午4:06:20
 */
public interface UserService {
	
	String testDubbo();
	
	void save(UserDO user);
}
