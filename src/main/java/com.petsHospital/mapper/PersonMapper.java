package com.petsHospital.mapper;

import com.petsHospital.domain.Person;

/**
 * Created by Administrator on 2017/3/6 0006.
 */
public interface PersonMapper {
    Person selectPersonById(Integer id);
}
