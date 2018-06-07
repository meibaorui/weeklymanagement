package com.wanfangdata.weekly.controller;

import com.wanfangdata.weekly.auth.Role;
import com.wanfangdata.weekly.auth.pojo.AuthUser;
import com.wanfangdata.weekly.common.util.MD5Util;
import com.wanfangdata.weekly.entity.Admin;
import com.wanfangdata.weekly.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
	@Autowired
	HttpServletRequest request;
	@Autowired
	AdminMapper adminMapper;

	/**
	 * 普通用户登录首页
	 * @return
	 */
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String employeeLogin() {
		return "index";
	}

	/**
	 * 管理员登录首页
	 * @return
	 */
	@RequestMapping(value = "/admin",method = RequestMethod.GET)
	public String adminLogin(String errorMessage,Model model){
		model.addAttribute("errorMessage",errorMessage);
		return "admin/login";
	}

	@RequestMapping(value = "/adminLogin",method = RequestMethod.POST)
	public String adminLogin(String id,String password,Model model){
		Admin admin = new Admin();
		admin.setAdminId(id);
		admin = adminMapper.selectOne(admin);
		if(admin==null){
			model.addAttribute("errorMessage","用户名不存在");
			return "redirect:/admin";
		}
		if(!MD5Util.checkStr(password, admin.getAdminPassword())){
			model.addAttribute("errorMessage","密码错误");
			return "redirect:/admin";
		}
		AuthUser authUser = new AuthUser(admin.getAdminId(), admin.getAdminId(), Role.ADMIN);
		AuthUser.setAuthUserToSession(request,authUser);
		return "redirect:/admin/dashboard";
	}

	@RequestMapping("/logout")
	public String logout(){
		AuthUser.cleanAuthUserSession(request);
		return "redirect:/";
	}
}
