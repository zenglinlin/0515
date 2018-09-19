package com.web.yt.mapper;

import java.util.List;

import com.web.yt.pojo.BasicPO;

public interface BasicPOMapper {
	
    List<BasicPO> basicQuery();

	int deleteByPrimaryKey(Integer baseId);

    int insert(BasicPO record);

    int insertSelective(BasicPO record);

    BasicPO selectByPrimaryKey(Integer baseId);

    int updateByPrimaryKeySelective(BasicPO record);

    int updateByPrimaryKey(BasicPO record);
}