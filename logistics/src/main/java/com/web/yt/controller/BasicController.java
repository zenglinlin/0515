package com.web.yt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.yt.pojo.BasicPO;
import com.web.yt.service.BasicQuery;


@Controller
@RequestMapping("/basic")
public class BasicController {
	
	@Resource
	private BasicQuery basicquery;
	
	@RequestMapping("/query")
	public String BasicQuery(Model model) {
		
		List<BasicPO> queryList = basicquery.basicQueryList();
		
		model.addAttribute("queryList", queryList);
		
		return "Basic/index";
	}
}
