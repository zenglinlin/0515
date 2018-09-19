package com.web.yt.mapper;

import java.util.List;

import com.web.yt.pojo.MenuPO;

public interface MenuPOMapper {
    int deleteByPrimaryKey(Integer menuId);

    int insert(MenuPO record);

    int insertSelective(MenuPO record);

    MenuPO selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(MenuPO record);

    int updateByPrimaryKey(MenuPO record);

	List<MenuPO> selectMenu(MenuPO menu);

	List<MenuPO> selectMenuByRoleId(Integer roleId);

	List<MenuPO> selectMenuName();
}