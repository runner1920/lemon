package com.lemon.common.model.sys;

import java.io.Serializable;

/**
 * 角色菜单对应
 * @author jiangqk
 * @data 2017年11月29日 下午2:31:28
 */
public class SysRoleMenu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -218708954094968287L;
	
	private Long id;

	/**
	 * 角色ID
	 */
	private Long roleId;

	/**
	 * 菜单ID
	 */
	private Long menuId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	
}
