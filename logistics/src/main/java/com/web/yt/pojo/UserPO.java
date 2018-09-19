package com.web.yt.pojo;

import java.util.List;

public class UserPO extends PagePO{
	private Integer userId;

	private String userName;

	private String realName;

	private String password;

	private String email;

	private String phone;

	private String u1;

	private String u2;

	private List<RolePO> roles;

	public List<RolePO> getRoles() {
		return roles;
	}

	public void setRoles(List<RolePO> roles) {
		this.roles = roles;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName == null ? null : realName.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getU1() {
		return u1;
	}

	public void setU1(String u1) {
		this.u1 = u1 == null ? null : u1.trim();
	}

	public String getU2() {
		return u2;
	}

	public void setU2(String u2) {
		this.u2 = u2 == null ? null : u2.trim();
	}
}