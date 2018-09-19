package com.web.yt.mapper;

import com.web.yt.pojo.QuotationPO;

public interface QuotationPOMapper {
    int deleteByPrimaryKey(Integer quotationId);

    int insert(QuotationPO record);

    int insertSelective(QuotationPO record);

    QuotationPO selectByPrimaryKey(Integer quotationId);

    int updateByPrimaryKeySelective(QuotationPO record);

    int updateByPrimaryKey(QuotationPO record);
}