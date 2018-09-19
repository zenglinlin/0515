package com.web.yt.mapper;

import java.util.List;

import com.web.yt.pojo.MenuPO;
import com.web.yt.pojo.RolePO;

public interface RolePOMapper {
	
    int deleteByPrimaryKey(Integer roleId);

    int insert(RolePO record);

    int insertSelective(RolePO record);

    RolePO selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(RolePO record);

    int updateByPrimaryKey(RolePO record);

	List<RolePO> roleQuery();

	List<RolePO> roleCondQuery(RolePO u);


}