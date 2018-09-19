package com.web.yt.pojo;

import java.util.List;

public class DtoUser {

	private UserPO user;
	private List<Integer> addRoles;

	@Override
	public String toString() {
		return "DtoUser [user=" + user + ", addRoles=" + addRoles + "]";
	}

	public UserPO getUser() {
		return user;
	}

	public void setUser(UserPO user) {
		this.user = user;
	}

	public List<Integer> getAddRoles() {
		return addRoles;
	}

	public void setAddRoles(List<Integer> addRoles) {
		this.addRoles = addRoles;
	}

}
