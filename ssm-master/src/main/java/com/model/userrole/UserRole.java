package com.model.userrole;

import java.io.Serializable;

public class UserRole implements Serializable {

	/**
	 * 用户权限表
	 */
	private static final long serialVersionUID = 5322423431L;
	
	private Integer urid;
	private Integer userId;
	private Integer roleId;
	public Integer getUrid() {
		return urid;
	}
	public void setUrid(Integer urid) {
		this.urid = urid;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
	
	
}
