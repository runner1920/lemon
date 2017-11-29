package com.lemon.common.model.sys;

import java.io.Serializable;

/**
 * 用户角色对应
 * @author jiangqk
 * @data 2017年11月29日 下午2:32:42
 */
public class SysUserRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8227501938695981112L;
	
	private Long id;

	/**
	 * 用户ID
	 */
	private Long userId;

	/**
	 * 角色ID
	 */
	private Long roleId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
}
