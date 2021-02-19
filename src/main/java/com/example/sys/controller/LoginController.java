package com.example.sys.controller;

import com.alibaba.fastjson.JSON;
import com.example.sys.entity.User;
import com.example.sys.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class LoginController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/login")
    public String login(@RequestBody User user){
        String flag="error";
       User us=userMapper.getUserByMessage(user.getId(),user.getPassword());
        System.out.println("user:"+us);
        HashMap<String,Object> res=new HashMap<>();
        if(us!=null){
            flag="ok";
        }
        res.put("flag",flag);
        res.put("user",user);
        String res_json = JSON.toJSONString(res);
        return res_json;
    }
}
