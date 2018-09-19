package com.web.yt.service;

import java.util.List;

import com.web.yt.pojo.MenuPO;
import com.web.yt.pojo.RolePO;

public interface RoleService {

	List<RolePO> roleQueryList();

	List<RolePO> roleCondQueryList(RolePO u);

	int deleteByPrimaryKey(Integer roleId);

    int insert(RolePO record);

    int insertSelective(RolePO record);

    RolePO selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(RolePO record);

    int updateByPrimaryKey(RolePO record);

	List<MenuPO> selectMenuByRoleId(Integer roleId);

	Integer selectUserIdsByRoleId(Integer roleId);

	void deleteByRoleId(Integer roleId);

	List<MenuPO> selectMenu(Integer roleId);

}
