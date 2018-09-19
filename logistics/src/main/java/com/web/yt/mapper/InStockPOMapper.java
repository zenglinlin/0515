package com.web.yt.mapper;

import com.web.yt.pojo.InStockPO;

public interface InStockPOMapper {
    int deleteByPrimaryKey(Integer inStockId);

    int insert(InStockPO record);

    int insertSelective(InStockPO record);

    InStockPO selectByPrimaryKey(Integer inStockId);

    int updateByPrimaryKeySelective(InStockPO record);

    int updateByPrimaryKey(InStockPO record);
}