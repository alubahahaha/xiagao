package com.example.sys.mapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.sys.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void test(){
        userMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void save(){                        //添加
        User user = new User();
        user.setId(5);
        user.setName("Dsb");
        user.setPassword("433333");
        userMapper.insert(user);
    }

    @Test
    void update(){                      //修改
        User user = userMapper.selectById(1001);
        System.out.println(user);
        user.setName("AbAd");
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("password", "12333");
        userMapper.update(user,wrapper);
    }

    @Test
    void select(){
//        userMapper.selectList(null);       //findall
//        userMapper.selectById(1001);            //byid
//        QueryWrapper wrapper = new QueryWrapper();                       //可以逻辑判断
//        wrapper.eq("name","xi");           //条件查询
////        wrapper.inSql("id","select id from user where age >1")
//        //        wrapper.inSql("id","select id from user where age<5")         联合查询
//        System.out.println(userMapper.selectList(wrapper));

//        Map<String ,Object> map = new HashMap<>();                     //只能等值判断
//        map.put("id",1001);
//        userMapper.selectByMap(map).forEach(System.out::println);

        Page<User> page = new Page<>(1,2);                   //按页码查询
        Page<User> result = userMapper.selectPage(page,null);
        System.out.println(result.getSize());
        System.out.println(result.getTotal());
        result.getRecords().forEach(System.out::println);
    }
    @Test
    void delete(){
        userMapper.deleteById(1001);

    }
}
