package com.web.yt.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.yt.mapper.MenuPOMapper;
import com.web.yt.pojo.MenuPO;
import com.web.yt.service.MenuService;

import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

@Service
public class MenuServiceImpl implements MenuService {
	
	@Resource
	private MenuPOMapper menuMapper;
	
	@Resource
	private JedisCluster cluster;
	
	@Resource	
	private JedisPool pool;

	@Override
	public List<MenuPO> queryMenuByCondtion(MenuPO menu) {
		// TODO Auto-generated method stub
		return menuMapper.selectMenu(menu);
	}

	@Override
	public List<MenuPO> selectMenuName() {
		// TODO Auto-generated method stub
		return menuMapper.selectMenuName();
	}

	@Override
	public boolean addMenu(MenuPO menu) {
		// TODO Auto-generated method stub
		menuMapper.insertSelective(menu);
		
		return true;
	}
}
