package com.yjxxt.service;

import com.yjxxt.bean.User;
//业务层
public interface UserService {
    //登录
    public User findUserByNameAndPwd(User user);
    //修改
    public int changeUser(User user);
    //查询
    public User findUserById(Integer id);
    //注销，业务代码

}
