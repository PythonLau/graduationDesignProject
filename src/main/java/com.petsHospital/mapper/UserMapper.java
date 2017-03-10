package com.petsHospital.mapper;

import com.petsHospital.domain.User;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2017/3/10 0010.
 */
public interface UserMapper{
    @Select("select * from tb_user where id = #{id}")
    User selectById(Integer id);
}
