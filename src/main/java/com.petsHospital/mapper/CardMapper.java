package com.petsHospital.mapper;

import com.petsHospital.domain.Card;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
public interface CardMapper {
    @Select("select * from tb_card where id = #{id}")
    Card selectCardById(Integer id);
}
