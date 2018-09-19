package com.web.yt.mapper;

import java.util.List;

import com.web.yt.pojo.DtoUser;
import com.web.yt.pojo.UserPO;

public interface UserPOMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserPO record);

    int insertSelective(UserPO record);

    UserPO selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserPO record);

    int updateByPrimaryKey(UserPO record);

	List<UserPO> userQuery();

	List<UserPO> userCondQuery(UserPO u);

	void addUserRoles(DtoUser dUser);
	
	int deleteByUserId(Integer userId);
	
	UserPO selectByUserName(String userName);
}