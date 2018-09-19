package com.web.yt.mapper;

import com.web.yt.pojo.OrderPO;

public interface OrderPOMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderPO record);

    int insertSelective(OrderPO record);

    OrderPO selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(OrderPO record);

    int updateByPrimaryKey(OrderPO record);
}