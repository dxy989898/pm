package com.yjxxt.mapper;

import com.yjxxt.bean.User;

public interface UserMapper {
    //登录
    public User selectUserByNameAndPwd(User user);
    //修改
    public int updateUser(User user);
    //查询
    public User selectUserById(Integer id);
}
