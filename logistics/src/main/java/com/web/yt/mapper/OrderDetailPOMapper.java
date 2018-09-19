package com.web.yt.mapper;

import com.web.yt.pojo.OrderDetailPO;

public interface OrderDetailPOMapper {
    int deleteByPrimaryKey(Integer orderDetailId);

    int insert(OrderDetailPO record);

    int insertSelective(OrderDetailPO record);

    OrderDetailPO selectByPrimaryKey(Integer orderDetailId);

    int updateByPrimaryKeySelective(OrderDetailPO record);

    int updateByPrimaryKey(OrderDetailPO record);
}