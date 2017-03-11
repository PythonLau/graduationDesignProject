package com.petsHospital.mapper;

import com.petsHospital.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/10 0010.
 */
@Service("userMapper")
public interface UserMapper{
    @Select("select * from tb_user where loginname = #{loginname} and password = #{password}")
    User findWithLoginnameAndPassword(@Param("loginname") String loginname,
                                      @Param("password") String password);
}
