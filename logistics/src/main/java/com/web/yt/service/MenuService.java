package com.web.yt.service;

import java.util.List;

import com.web.yt.pojo.MenuPO;

public interface MenuService {

	List<MenuPO> queryMenuByCondtion(MenuPO menu);

	List<MenuPO> selectMenuName();

	boolean addMenu(MenuPO menu);

}
