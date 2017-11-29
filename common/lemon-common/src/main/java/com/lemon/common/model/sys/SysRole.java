package com.lemon.common.model.sys;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author jiangqk
 * @data 2017年11月29日 下午2:30:07
 */
public class SysRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4390546158860069276L;
	
	/**
	 * 角色ID
	 */
	private Long roleId;

	/**
	 * 角色名称
	 */
	private String roleName;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 部门ID
	 */
	private Long deptId;
	
	/**
	 * 创建时间
	 */
	private Date createTime;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
