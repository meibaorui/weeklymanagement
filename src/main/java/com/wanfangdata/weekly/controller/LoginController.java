package com.wanfangdata.weekly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

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
	public String adminLogin(){
		return "admin/login";
	}
}
