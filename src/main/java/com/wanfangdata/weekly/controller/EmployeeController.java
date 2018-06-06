package com.wanfangdata.weekly.controller;

import com.wanfangdata.weekly.auth.AuthPassport;
import com.wanfangdata.weekly.auth.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by meibaorui on 2018/6/5.
 */
@AuthPassport(role = Role.EMPLOYEE)
@RequestMapping("/dashboard")
@Controller
public class EmployeeController {
    @Autowired
    HttpServletRequest request;

    @RequestMapping("/")
    public String index(){
        return "employee/index";
    }
}
