package com.petsHospital.mapper;

import com.petsHospital.domain.Order;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

/**
 * Created by Administrator on 2017/3/10 0010.
 */
public interface OrderMapper {
    @Select("select * from tb_order where id = #{id}")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "code",property = "code"),
            @Result(column = "total",property = "total"),
            @Result(column = "user_id",property = "user",
            one=@One(select="com.petsHospital.mapper.UserMapper.selectById",
            fetchType = FetchType.EAGER)),
            @Result(column = "id",property = "articles",
            many=@Many(select="com.petsHospital.mapper.ArticleMapper.selectByOrderId",
            fetchType = FetchType.LAZY))
    })
    Order selectById(Integer id);
}
