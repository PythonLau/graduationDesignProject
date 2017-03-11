package com.petsHospital.service.Impl;

import com.petsHospital.domain.User;
import com.petsHospital.mapper.UserMapper;
import com.petsHospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/11 0011.
 */
//@Service("userService")用于将当前类注释为一个Spring的bean，名为userService
@Service("userService")
public class UserServiceImpl implements UserService{
    //自动注入UserMapper
    @Autowired
    private UserMapper userMapper;
    //UserService接口login方法实现
    @Override
    public User login(String loginname,String password){
        return userMapper.findWithLoginnameAndPassword(loginname,password);
    }
}
