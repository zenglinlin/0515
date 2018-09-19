package com.web.yt.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.yt.mapper.BasicPOMapper;
import com.web.yt.pojo.BasicPO;
import com.web.yt.service.BasicQuery;

@Service
public class BasicQueryImpl implements BasicQuery {
	
	@Resource
	private BasicPOMapper mapper;

	@Override
	public List<BasicPO> basicQueryList() {
		
		return mapper.basicQuery();
	}

}
