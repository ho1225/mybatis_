package com.schh.mapper;

import com.schh.pojo.User;

import java.util.List;

public interface UserMapper {


    List<User> selectAll();

    User selectById(int id);

}
