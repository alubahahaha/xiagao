package com.example.sys.controller;


import com.alibaba.fastjson.JSON;
import com.example.sys.entity.User;
import com.example.sys.mapper.UserMapper;
import com.example.sys.service.UserService;
import com.fasterxml.jackson.annotation.JsonAlias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author example
 * @since 2021-02-14
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/alluser")
    public String getUserList(QueryInfo queryInfo){
       int numbers = userMapper.getUserCounts("%"+queryInfo.getQuery()+"%");
        int pageStart = (queryInfo.getPageNum()-1) * queryInfo.getPageSize();

        List<User> users =userMapper.getAllUser("%" + queryInfo.getQuery() +"%",pageStart,
                queryInfo.getPageSize());
        HashMap<String,Object> res = new HashMap<>();
        res.put("numbers",numbers);
        res.put("data",users);
        String res_string = JSON.toJSONString(res);
        return res_string;
    }

        @RequestMapping("/userstate")
        public String updateUserState(@RequestParam("id") Integer id,
                                      @RequestParam("state") String state){
        int i =userMapper.updateState(id, state);
         String ret = i> 0 ? "success":"err";
         return ret;
        }

        @RequestMapping("/addUser")
        public String addUser(@RequestBody User user){
        user.setState("0");
        int i = userMapper.addUser(user);
        String ret = i > 0 ? "success":"err";
        return ret;
        }

        @RequestMapping("/deleteUser")
        public String deleteUser(int id){
           int i = userMapper.deleteUser(id);
           return i>0 ?"success":"err";
        }
        @RequestMapping("/getupdate")
        public String getUpdateUser(int id){
        User user = userMapper.getUpdateUser(id);
        String ret = JSON.toJSONString(user);
        return ret;
        }
    @RequestMapping("/edituser")
        public String editUser(@RequestBody User user){
        int i = userMapper.editUser(user);
            return i>0 ?"success":"err";
        }
}

