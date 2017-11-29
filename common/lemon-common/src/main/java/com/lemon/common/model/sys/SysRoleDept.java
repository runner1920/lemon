package com.lemon.common.model.sys;

import java.io.Serializable;

/**
 * 
 * @author jiangqk
 * @data 2017年11月29日 下午2:38:46
 */
public class SysRoleDept implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4609915513093479705L;
	
	private Long id;

	/**
	 * 角色ID
	 */
	private Long roleId;

	/**
	 * 部门ID
	 */
	private Long deptId;

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

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	
}
