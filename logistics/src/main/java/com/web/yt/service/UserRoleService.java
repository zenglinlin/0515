package com.web.yt.service;

import java.util.List;

import com.web.yt.pojo.UserRolePO;

public interface UserRoleService {

	int insert(UserRolePO record);

    int insertSelective(UserRolePO record);

	List<Integer> selectRoleIdByUserId(Integer userId);

	int deleteUserRole(Integer userId);
}
