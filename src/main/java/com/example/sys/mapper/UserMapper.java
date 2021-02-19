package com.example.sys.mapper;

import com.example.sys.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author example
 * @since 2021-02-14
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    public  User getUserByMessage(@Param("id") int id,@Param("password") String password);
    public List<User> getAllUser(@Param("id") String id, @Param("pageStart") int pageStart,
                                 @Param("pageSize") int pageSize);
    public int getUserCounts(@Param("id") String id);
    public int updateState(Integer id,String state);
    public int addUser(User user);
    public int deleteUser(int id);
    public User getUpdateUser(int id);
    public int editUser(User user);
}
