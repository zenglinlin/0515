package com.web.yt.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.yt.pojo.MenuPO;
import com.web.yt.pojo.RolePO;
import com.web.yt.pojo.UserPO;
import com.web.yt.service.RoleService;
import com.web.yt.utils.ResponseData;

@Controller
@RequestMapping("/role")
public class RoleController {

	@Resource
	private RoleService role;

	@RequestMapping("/query")
	public String userConditionQuery(Model model, RolePO u) {

		List<RolePO> roleList = role.roleCondQueryList(u);

		model.addAttribute("roleList", roleList);

		model.addAttribute("role", u);

		return "Role/index";

	}

	@RequestMapping("/addOne")
	public String roleAdd(Model model) {

		return "Role/add";
	}

	@PostMapping("/add")
	public String roleAdd(Model model, RolePO roles) {

		role.insertSelective(roles);

		return "redirect:/role/query";
	}

	@GetMapping("/update")
	public String roleUpdate(Model model, Integer roleId) {
		RolePO rolePO = role.selectByPrimaryKey(roleId);
		model.addAttribute("rolePO", rolePO);
		System.out.println(rolePO);
		return "Role/update";
	}

	@PostMapping("/update")
	public String roleUpdate(Model model, RolePO roles) {

		role.updateByPrimaryKeySelective(roles);

		return "redirect:/role/query";
	}

	@GetMapping("/addPower")
	public String roleMenuAdd(Model model, Integer roleId) {
		
		List<MenuPO> roleMenu = role.selectMenuByRoleId(roleId);
		model.addAttribute("roleMenu", roleMenu);

		List<MenuPO> menu = role.selectMenu(roleId);
		model.addAttribute("menu", menu);

		return "Role/assignment";
	}

	/*
	 * @PostMapping("/addPower") public String roleMenuAdd1(Model model,Integer
	 * roleId) { List<MenuPO> roleMenu= role.selectMenuByRoleId(roleId);
	 * model.addAttribute("roleMenu", roleMenu);
	 * 
	 * List<MenuPO> menu= role.selectMenu(); model.addAttribute("menu", menu);
	 * 
	 * return "Role/assignment"; }
	 */

	@GetMapping("/delete")
	@ResponseBody
	public ResponseData roleDelete(Model model, Integer roleId) {

		Integer count = role.selectUserIdsByRoleId(roleId);

		ResponseData responseData = new ResponseData();
		if (count >= 1) {
			responseData.setStatus(2);
			responseData.setMessage("角色已经分配给了用户");
		} else {
			// 删除和菜单信息表、角色表的内容
			role.deleteByRoleId(roleId);
			responseData.setStatus(1);
		}

		return responseData;
	}
}
