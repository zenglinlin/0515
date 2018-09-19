package com.web.yt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.web.yt.pojo.DtoUser;
import com.web.yt.pojo.RolePO;
import com.web.yt.pojo.UserPO;
import com.web.yt.pojo.UserRolePO;
import com.web.yt.service.RoleService;
import com.web.yt.service.UserRoleService;
import com.web.yt.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService user;
	@Resource
	private RoleService role;
	
	@Resource
	private UserRoleService userRole;

	@RequestMapping("/queryRole")
	public String roleQueryList(Model model) {

		List<RolePO> roleList = role.roleQueryList();

		model.addAttribute("roleList", roleList);

		return "User/add";
	}

	@RequestMapping("/query")
	public String selectUserPage(Model model, UserPO u) {

		PageInfo<UserPO> userPageList = user.selectUserPage(u);

		model.addAttribute("pageInfo", userPageList);

		return "User/index";

	}
	
	
/*	@RequestMapping("/query")
	public String userConditionQuery(Model model, UserPO u) {

		List<UserPO> userList = user.userCondQueryList(u);

		model.addAttribute("userList", userList);

		model.addAttribute("user", u);

		return "User/index";

	}*/
	

	@PostMapping("/add")
	public String userAdd(Model model, DtoUser dUser) {
		
		
		

		
		boolean isAdd = user.addUserRoles(dUser);
		if (isAdd) {

			return "redirect:/user/query";
		} else {
			return "User/add";
		}
	}

	@GetMapping("/update")
	public String userUpdate(Model model,Integer userId) {
		
		UserPO selectUser = user.selectByPrimaryKey(userId);
		
		List<Integer> selectRole = userRole.selectRoleIdByUserId(userId);
		
		List<RolePO> roleList = role.roleQueryList();
		
		model.addAttribute("roleList", roleList);
		model.addAttribute("selectUser", selectUser);
		model.addAttribute("selectRole",selectRole);
		
		return "User/update";
	}
	
	@PostMapping("/update")
	public String userRoleUpdate(Model model, DtoUser dUser) {

		boolean isUpdate = user.userRoleUpdate(dUser);
		if (isUpdate) {

			return "redirect:/user/query";
		} else {
			return "User/update";
		}
	}
	
	@RequestMapping("/delete")
	public String userRoleDelete(Model model,Integer userId) {
		
		userRole.deleteUserRole(userId);
		
		user.deleteByPrimaryKey(userId);
		
		return "redirect:/user/query";
	}
}
