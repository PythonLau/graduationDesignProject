package com.petsHospital.mapper;

import com.petsHospital.domain.Clazz;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
public interface ClazzMapper {
    @Select("select * from tb_clazz where id = #{id}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "code",property = "code"),
            @Result(column = "name",property = "name"),
            @Result(column = "id",property = "students",
                    many = @Many(
                            select = "com.petsHospital.mapper.StudentMapper.selectByClazzId",
                            fetchType = FetchType.LAZY
                    )
            )
    })
    Clazz selectById(Integer id);
}
