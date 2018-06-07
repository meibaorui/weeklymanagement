package com.wanfangdata.weekly.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.wanfangdata.weekly.auth.AuthPassport;
import com.wanfangdata.weekly.auth.Role;
import com.wanfangdata.weekly.entity.Position;
import com.wanfangdata.weekly.mapper.PositionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

/**
 * Created by meibaorui on 2018/6/6.
 */
@AuthPassport(role = Role.ADMIN)
@RequestMapping("/admin")
@Controller
public class AdminController {
    @Autowired
    HttpServletRequest request;
    @Autowired
    PositionMapper positionMapper;

    @RequestMapping("/dashboard")
    public String index(){
        return "admin/index";
    }

    @RequestMapping(value = "/addEmployee",method = RequestMethod.GET)
    public String addEmployee(){
        return "admin/editorEmployee";
    }

    @RequestMapping(value = "/addPosition",method = RequestMethod.GET)
    public String addPosition(){
        return "admin/editorPosition";
    }

    @RequestMapping(value = "/positionManager")
    public String positionManager(){
        return "admin/positionManager";
    }

    @RequestMapping(value = "/addPosition",method = RequestMethod.POST)
    public String addPosition(String positionName,String positionLevel,Model model){
        String errorMEssage="";
        if(positionName==null||positionLevel==null||positionName.equals("")||positionLevel.equals("")){
            errorMEssage = "岗位序列名称或岗位等级不能为空";
            model.addAttribute("errorMessage",errorMEssage);
            return "admin/editorPosition";
        }
        if(positionName.length()>20){
            errorMEssage = "岗位序列名称不能超过20个字";
            model.addAttribute("errorMessage",errorMEssage);
            return "admin/editorPosition";
        }

        Position position = new Position();
        position.setPositionLevel(positionLevel);
        position.setPositionSequenceName(positionName);

        try{
            Position p = positionMapper.selectOne(position);
            if(p!=null){
                errorMEssage = "数据库中已存在此岗位";
                model.addAttribute("errorMessage",errorMEssage);
                return "admin/editorPosition";
            }
            String uuid = UUID.randomUUID().toString();
            position.setPositionId(uuid);
            positionMapper.insert(position);
        }catch (Exception ex){
            throw ex;
        }
        return "admin/editorPosition";
    }
}
