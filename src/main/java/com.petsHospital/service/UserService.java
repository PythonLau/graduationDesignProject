package com.petsHospital.service;

import com.petsHospital.domain.User;

/**
 * Created by Administrator on 2017/3/11 0011.
 */
public interface UserService {
    User login(String loginname,String password);
}
