package com.web.yt.service.Impl;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.web.yt.mapper.RolePOMapper;
import com.web.yt.mapper.UserPOMapper;
import com.web.yt.mapper.UserRolePOMapper;
import com.web.yt.pojo.DtoUser;
import com.web.yt.pojo.UserPO;
import com.web.yt.pojo.UserRolePO;
import com.web.yt.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserPOMapper mapper;

	@Resource
	private UserRolePOMapper roleMapper;
	
	@Resource
	private RolePOMapper role;

	@Override
	public List<UserPO> userQueryList() {
		// TODO Auto-generated method stub
		return mapper.userQuery();
	}

	@Override
	public int deleteByPrimaryKey(Integer userId) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(userId);
	}

	@Override
	public int insert(UserPO record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(UserPO record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserPO selectByPrimaryKey(Integer userId) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(userId);
	}

	@Override
	public int updateByPrimaryKeySelective(UserPO record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(UserPO record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserPO> userCondQueryList(UserPO u) {
		// TODO Auto-generated method stub
		return mapper.userCondQuery(u);
	}

	@Override
	public boolean addUserRoles(DtoUser dUser) {
		
		UserPO user = dUser.getUser();
		
		String newPassWord = new Md5Hash(user.getPassword()).toString();

		user.setPassword(newPassWord);	
		
		mapper.insertSelective(user);

		List<Integer> roles = dUser.getAddRoles();
		if (roles != null && !roles.isEmpty()) {
			for (Integer role : roles) {
				UserRolePO userRole = new UserRolePO(user.getUserId(), role);
				roleMapper.insert(userRole);
			}
		}
		return true;
	}

	@Override
	public boolean userRoleUpdate(DtoUser dUser) {
		
		UserPO user = dUser.getUser();
		
		String newPassWord = new Md5Hash(user.getPassword()).toString();
		
		mapper.updateByPrimaryKeySelective(user);
		
		roleMapper.deleteByUserId(user.getUserId());
		
		List<Integer> roles = dUser.getAddRoles();
		if (roles != null && !roles.isEmpty()) {
			for (Integer role : roles) {
				UserRolePO userRole = new UserRolePO(dUser.getUser().getUserId(), role);
				roleMapper.insert(userRole);
			}
		}
		return true;
	}

	@Override
	public PageInfo<UserPO> selectUserPage(UserPO u) {
		
		// TODO Auto-generated method stub
		PageHelper.startPage(u.getPageNum(), u.getPageSize());
		
		List<UserPO> list = mapper.userCondQuery(u);
		
		PageInfo<UserPO> pageInfo = new PageInfo<>(list);
		
		return pageInfo;
	}

	@Override
	public UserPO queryByUserName(String userName) {
		// TODO Auto-generated method stub
		return mapper.selectByUserName(userName);
	}

}
