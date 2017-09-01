package com.lemon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lemon.common.model.UserDO;
import com.lemon.common.service.UserService;
import com.lemon.service.dao.UserDao;

/**
 * 
 * @author jiangqk
 * @data 2017年8月31日 上午11:04:39
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public String testDubbo() {
		return "test success";
	}

	@Override
	@Transactional
	public void save(UserDO user) {
		userDao.save(user);
		System.out.println(user.getUserId());
	}
	
}
