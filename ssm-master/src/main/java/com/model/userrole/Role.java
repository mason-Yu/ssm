package com.model.userrole;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {

	/**
	 * 权限表
	 */
	private static final long serialVersionUID = 1423343L;

	private Integer roleId;
	private String roleName;
	private String roleDec;
	private Date updateDate;
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDec() {
		return roleDec;
	}
	public void setRoleDec(String roleDec) {
		this.roleDec = roleDec;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}
