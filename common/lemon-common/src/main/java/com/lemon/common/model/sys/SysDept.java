package com.lemon.common.model.sys;

import java.io.Serializable;

/**
 * 部门管理
 * @author jiangqk
 * @data 2017年11月29日 下午2:36:03
 */
public class SysDept implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1675004928008722435L;
	
	/**
	 * 部门ID
	 */
	private Long deptId;
	
	/**
	 * 上级部门ID，一级部门为0
	 */
	private Long parentId;
	
	/**
	 * 部门名称
	 */
	private String name;
	
	/**
	 * 上级部门名称
	 */
	private String parentName;
	
	/**
	 * 排序
	 */
	private Integer orderNum;

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	
}
