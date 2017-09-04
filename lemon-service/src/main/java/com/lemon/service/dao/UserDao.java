package com.lemon.service.dao;

import java.util.List;

import com.lemon.common.model.UserDO;

/**
 * 
 * @author jiangqk
 * @data 2017年9月1日 下午2:41:24
 */
public interface UserDao {
	
	public void save(UserDO user);
	
	public List<UserDO> listAllUser();
}
