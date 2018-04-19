package com.yeshaohua.mapper;

import com.yeshaohua.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user where id = #{id}")
    User findUserById(int id);

    @Insert("insert into user(username,password) values(#{username},#{password})")
    void addUser(User user);

    @Select("select * from user")
    List<User> getAllUsers();

}
