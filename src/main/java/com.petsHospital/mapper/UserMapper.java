package com.petsHospital.mapper;

import com.petsHospital.domain.User;

/**
 * Created by Administrator on 2017/3/7 0007.
 */
public interface UserMapper {
    User selectUserById(int id);
}
