package com.web.yt.mapper;

import com.web.yt.pojo.InStockDetailPO;

public interface InStockDetailPOMapper {
    int deleteByPrimaryKey(Integer stockDetailId);

    int insert(InStockDetailPO record);

    int insertSelective(InStockDetailPO record);

    InStockDetailPO selectByPrimaryKey(Integer stockDetailId);

    int updateByPrimaryKeySelective(InStockDetailPO record);

    int updateByPrimaryKey(InStockDetailPO record);
}