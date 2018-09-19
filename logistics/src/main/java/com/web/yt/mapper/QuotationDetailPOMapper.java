package com.web.yt.mapper;

import com.web.yt.pojo.QuotationDetailPO;

public interface QuotationDetailPOMapper {
    int deleteByPrimaryKey(Integer quotationDetailId);

    int insert(QuotationDetailPO record);

    int insertSelective(QuotationDetailPO record);

    QuotationDetailPO selectByPrimaryKey(Integer quotationDetailId);

    int updateByPrimaryKeySelective(QuotationDetailPO record);

    int updateByPrimaryKey(QuotationDetailPO record);
}