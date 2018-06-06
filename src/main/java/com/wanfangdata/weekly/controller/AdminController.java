package com.wanfangdata.weekly.controller;

import com.wanfangdata.weekly.auth.AuthPassport;
import com.wanfangdata.weekly.auth.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by meibaorui on 2018/6/6.
 */
@AuthPassport(role = Role.ADMIN)
@RequestMapping("/admin")
@Controller
public class AdminController {
    @Autowired
    HttpServletRequest request;

    @RequestMapping("/dashboard")
    public String index(){
        return "admin/index";
    }
}
