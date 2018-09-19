package com.web.yt.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.yt.mapper.UserRolePOMapper;
import com.web.yt.pojo.UserRolePO;
import com.web.yt.service.UserRoleService;

@Service
public class UserRoleImpl implements UserRoleService{

	@Resource
	private UserRolePOMapper userRoleMapper;

	@Override
	public int insert(UserRolePO record) {
		// TODO Auto-generated method stub
		return userRoleMapper.insert(record);
	}

	@Override
	public int insertSelective(UserRolePO record) {
		// TODO Auto-generated method stub
		return userRoleMapper.insertSelective(record);
	}

	@Override
	public List<Integer> selectRoleIdByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return userRoleMapper.selectRoleIdByUserId(userId);
	}

	@Override
	public int deleteUserRole(Integer userId) {
		// TODO Auto-generated method stub
		return userRoleMapper.deleteByUserId(userId);
	}

	
}
