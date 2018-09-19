package com.web.yt.pojo;

public class UserRolePO {
	private Integer userId;

	private Integer roleId;

	public UserRolePO() {

	}

	public UserRolePO(Integer userId, Integer roleId) {

		this.userId = userId;
		this.roleId = roleId;
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