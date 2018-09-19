package com.web.yt.controller;

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.yt.pojo.UserPO;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String loginSubmit(HttpServletRequest request,UserPO user) throws AuthenticationException {
		
		// 1、获取Subject实例对象
		Subject currentUser = SecurityUtils.getSubject();
		
		 // 2、判断当前用户是否登录
        if (currentUser.isAuthenticated() == false) {
        	
            // 3、将用户名和密码封装到UsernamePasswordToken
            UsernamePasswordToken token
            	= new UsernamePasswordToken(user.getUserName(), user.getPassword());

            // 传到Realm类中的方法进行认证
			currentUser.login(token);
			// 添加到会话中
			request.getSession()
				.setAttribute("activeUser", currentUser.getPrincipal());
        }

        // 如果已经认证则跳转到首页
		return "/Public/index";
	}
}