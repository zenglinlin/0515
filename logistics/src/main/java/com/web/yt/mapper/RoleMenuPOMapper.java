package com.web.yt.mapper;

import java.util.List;

import com.web.yt.pojo.MenuPO;
import com.web.yt.pojo.RoleMenuPO;

public interface RoleMenuPOMapper {
    int insert(RoleMenuPO record);

    int insertSelective(RoleMenuPO record);

	void roleMenuDelete(Integer roleId);

	List<MenuPO> selectRoleMenu(Integer roleId);

}