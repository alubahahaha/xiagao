package com.example.sys.controller;

import com.alibaba.fastjson.JSON;
import com.example.sys.entity.Mainmenu;
import com.example.sys.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class MenuController {
    @Autowired
    MenuMapper menuMapper;

    @RequestMapping("/menus")
    public String getAllMenu(){
        System.out.println("访问成功");
        HashMap<String,Object> data = new HashMap<>();
        int status = 404 ;
        List<Mainmenu> menus = menuMapper.getMenus();
        if(menus!=null){
            data.put("menus",menus);
            data.put("flag",200);
        }else {
            data.put("flag",404);
        }
        String s=JSON.toJSONString(data);

        return s;
    }
}
