package com.petsHospital.mapper;

import com.petsHospital.domain.Student;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
public interface StudentMapper {
    @Select("select * from tb_student where clazz_id = #{id}")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "sex",property = "sex"),
            @Result(column = "age",property = "age")
    })
    List<Student> selectByClazzId(Integer clazz_id);
}
