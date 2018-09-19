package com.web.yt.mapper;

import com.web.yt.pojo.CustomPO;

public interface CustomPOMapper {
    int deleteByPrimaryKey(Integer customId);

    int insert(CustomPO record);

    int insertSelective(CustomPO record);

    CustomPO selectByPrimaryKey(Integer customId);

    int updateByPrimaryKeySelective(CustomPO record);

    int updateByPrimaryKey(CustomPO record);
}