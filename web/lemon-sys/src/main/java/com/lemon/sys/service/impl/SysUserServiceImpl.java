package com.lemon.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lemon.common.model.sys.SysUser;
import com.lemon.sys.dao.SysUserDao;
import com.lemon.sys.service.SysUserService;

/**
 * 
 * @author jiangqk
 * @data 2017年11月29日 下午2:47:53
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
	
	@Autowired
	private SysUserDao sysUserDao;

	@Override
	public void save(SysUser user) {
		sysUserDao.save(user);
	}
	
	
}
