package com.petsHospital.test;

import com.petsHospital.domain.Student;
import com.petsHospital.factory.FKSqlSessionFactory;
import com.petsHospital.mapper.PersonMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * Created by Administrator on 2017/3/6 0006.
 */
public class SelectStudentTest {
    public static void main(String[] args) throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder()
                .build(inputStream);
        factory.getConfiguration().addMapper(PersonMapper.class);
        SqlSession session = factory.openSession();
        List<Student> student_list = session.selectList("mapper.UserMapper.selectStudent");
        for(Student stu : student_list){
            System.out.println(stu.getName());
            System.out.println(stu.getClazz().getCode());
        }
        session.commit();
        session.close();
    }
}
