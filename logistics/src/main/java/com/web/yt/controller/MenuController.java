package com.web.yt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.yt.pojo.DtoUser;
import com.web.yt.pojo.MenuPO;
import com.web.yt.pojo.RolePO;
import com.web.yt.pojo.UserPO;
import com.web.yt.pojo.UserRolePO;
import com.web.yt.service.MenuService;
import com.web.yt.service.RoleService;
import com.web.yt.service.UserRoleService;
import com.web.yt.service.UserService;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@Resource
	private MenuService menuService;

	@RequestMapping("/query")
	public String userConditionQuery(Model model, MenuPO menu) {

		List<MenuPO> menuList = menuService.queryMenuByCondtion(menu);

		model.addAttribute("menuList", menuList);

		model.addAttribute("menu", menu);

		return "Menu/index";

	}

	@GetMapping("/add")
	public String userUpdate(Model model) {

		List<MenuPO> menuList = menuService.selectMenuName();

		System.out.println(menuList);

		model.addAttribute("menuList", menuList);

		return "Menu/add";
	}

	@PostMapping("/add")
	public String userAdd(Model model, MenuPO menu) {

		boolean isAdd = menuService.addMenu(menu);

		if (isAdd) {
			return "redirect:/menu/query";
		} else {
			return "Menu/add";
		}
	}

	/*
	 * @GetMapping("/update") public String userUpdate(Model model,Integer
	 * userId) {
	 * 
	 * UserPO selectUser = user.selectByPrimaryKey(userId);
	 * 
	 * List<Integer> selectRole = userRole.selectRoleIdByUserId(userId);
	 * 
	 * List<RolePO> roleList = role.roleQueryList();
	 * 
	 * model.addAttribute("roleList", roleList);
	 * model.addAttribute("selectUser", selectUser);
	 * model.addAttribute("selectRole",selectRole);
	 * 
	 * return "User/update"; }
	 * 
	 * @PostMapping("/update") public String userRoleUpdate(Model model, DtoUser
	 * dUser) {
	 * 
	 * boolean isUpdate = user.userRoleUpdate(dUser); if (isUpdate) {
	 * 
	 * return "redirect:/user/query"; } else { return "User/update"; } }
	 * 
	 * @RequestMapping("/delete") public String userRoleDelete(Model
	 * model,Integer userId) {
	 * 
	 * userRole.deleteUserRole(userId);
	 * 
	 * user.deleteByPrimaryKey(userId);
	 * 
	 * return "redirect:/user/query"; }
	 */
}
