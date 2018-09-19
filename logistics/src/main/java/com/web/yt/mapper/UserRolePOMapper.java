package com.web.yt.mapper;

import java.util.List;

import com.web.yt.pojo.UserRolePO;

public interface UserRolePOMapper {
	
    int insert(UserRolePO record);

    int insertSelective(UserRolePO record);
   
	List<Integer> selectRoleIdByUserId(Integer userId);

	int deleteByUserId(Integer userId);

	Integer selectUserIdsByRoleId();


}