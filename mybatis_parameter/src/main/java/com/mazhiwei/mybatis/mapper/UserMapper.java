package com.mazhiwei.mybatis.mapper;

import com.mazhiwei.mybatis.pojo.User;
import com.mazhiwei.mybatis.pojo.Users;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author 马治伟
 * @version 1.0
 */
public interface UserMapper {

    User selectByUserName(String username);

    User loginUser(int id, String username);

    //采用注解方式
    User loginUsers(@Param("id") int id, @Param("username") String username);

    User checkLogin(Map<String, Object> map);


    void insertUser(User user);

    User selectOne(@Param("id")
                   Integer id);

    List<User> selectAll();

    int getCount();

    Map<String,Object> selectByUserId(@Param("id") int id);

    @MapKey("id")
    Map<String,Object> selectByUserAll();

    List<Map<String,Object>> selectAllUser();

    void insertUsers(Users users);




}
