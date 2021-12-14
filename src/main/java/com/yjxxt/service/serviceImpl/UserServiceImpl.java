package com.yjxxt.service.serviceImpl;

import com.yjxxt.bean.User;
import com.yjxxt.mapper.UserMapper;
import com.yjxxt.service.UserService;

public class UserServiceImpl implements UserService {

    private UserMapper userMapper;
    //创建有参构造器---预防空指针异常
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User findUserByNameAndPwd(User user) {
        return userMapper.selectUserByNameAndPwd(user);
    }

    @Override
    public int changeUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.selectUserById(id);
    }
}
