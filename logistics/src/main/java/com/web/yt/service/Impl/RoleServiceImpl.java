package com.web.yt.service.Impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.yt.mapper.MenuPOMapper;
import com.web.yt.mapper.RoleMenuPOMapper;
import com.web.yt.mapper.RolePOMapper;
import com.web.yt.mapper.UserRolePOMapper;
import com.web.yt.pojo.MenuPO;
import com.web.yt.pojo.RoleMenuPO;
import com.web.yt.pojo.RolePO;
import com.web.yt.service.RoleService;

import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

@Service
public class RoleServiceImpl implements RoleService {

	@Resource
	private RolePOMapper mapper;

	@Resource
	private MenuPOMapper menuPOMapper;

	@Resource
	private UserRolePOMapper userRole;

	@Resource
	private RoleMenuPOMapper roleMenu;

	@Resource
	private JedisCluster cluster;

	@Resource
	private JedisPool pool;

	@Override
	public List<RolePO> roleQueryList() {
		// TODO Auto-generated method stub
		return mapper.roleQuery();
	}

	@Override
	public List<RolePO> roleCondQueryList(RolePO u) {
		// TODO Auto-generated method stub
		return mapper.roleCondQuery(u);
	}

	@Override
	public int deleteByPrimaryKey(Integer roleId) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(roleId);
	}

	@Override
	public int insert(RolePO record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(RolePO record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public RolePO selectByPrimaryKey(Integer roleId) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(roleId);
	}

	@Override
	public int updateByPrimaryKeySelective(RolePO record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(RolePO record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<MenuPO> selectMenuByRoleId(Integer roleId) {
		
		List<MenuPO> menus = null;
		
		// 先查询缓存是否存在对应用户的菜单信息
		String userMenusKey = "user:menus:"+roleId;
		if (!cluster.exists(userMenusKey)) {
			// 如果不存在，则查询数据库，并且把菜单信息添加到缓存中
			menus = menuPOMapper.selectMenuByRoleId(roleId);
			for (MenuPO menuPO : menus) {
				try {
					String menuJson = JacksonUtil.bean2Json(menuPO);
					cluster.rpush(userMenusKey, menuJson);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		else {
			// 如果存在，就直接从缓存中取
			List<String> list = cluster.lrange(userMenusKey, 0, -1);
			menus = new ArrayList<>();
			for (String string : list) {
				menus.add(e)
			}
				
		}		
		return menus;
}

	@Override
	public Integer selectUserIdsByRoleId(Integer roleId) {

		return userRole.selectUserIdsByRoleId();
	}

	@Override
	public void deleteByRoleId(Integer roleId) {

		// 删除角色和菜单信息表内容
		roleMenu.roleMenuDelete(roleId);

		// 删除角色表信息内容
		mapper.deleteByPrimaryKey(roleId);
	}

	@Override
	public List<MenuPO> selectMenu(Integer roleId) {
		// TODO Auto-generated method stub
		return roleMenu.selectRoleMenu(roleId);
	}

}
