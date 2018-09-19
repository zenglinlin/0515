package com.web.yt.service;

import java.util.ArrayList;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.web.yt.pojo.DtoUser;
import com.web.yt.pojo.UserPO;

public interface UserService {

	List<UserPO> userQueryList();

	int deleteByPrimaryKey(Integer userId);

	int insert(UserPO record);

	int insertSelective(UserPO record);

	UserPO selectByPrimaryKey(Integer userId);

	int updateByPrimaryKeySelective(UserPO record);

	int updateByPrimaryKey(UserPO record);

	List<UserPO> userCondQueryList(UserPO u);

	boolean addUserRoles(DtoUser dUser);

	boolean userRoleUpdate(DtoUser dUser);

	PageInfo<UserPO> selectUserPage(UserPO u);
	
	UserPO queryByUserName(String userName);

}
