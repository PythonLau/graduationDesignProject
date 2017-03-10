package com.petsHospital.test;

import com.petsHospital.domain.Clazz;
import com.petsHospital.domain.Student;
import com.petsHospital.factory.FKSqlSessionFactory;
import com.petsHospital.mapper.ClazzMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2017/3/10 0010.
 */
public class OneToManyTest {
    public static void main(String[] args) throws Exception{
        SqlSession session = FKSqlSessionFactory.getSqlSession();
        ClazzMapper cm = session.getMapper(ClazzMapper.class);
        Clazz clazz = cm.selectById(1);
        System.out.println(clazz.getId() + " " + clazz.getCode() + " " + clazz.getName());
        List<Student> students = clazz.getStudents();
        for(Student student : students){
            System.out.println(student);
        }
        session.commit();
        session.close();
    }
}
