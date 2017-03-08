package com.petsHospital.test;


import com.petsHospital.domain.Clazz;
import com.petsHospital.domain.Student;
import com.petsHospital.factory.FKSqlSessionFactory;
import com.petsHospital.mapper.ClazzMapper;
import com.petsHospital.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2017/3/7 0007.
 */
public class OneToManyTest {
    public static void main(String[] args) throws Exception{;
        SqlSession session = FKSqlSessionFactory.getSqlSession();
        OneToManyTest t = new OneToManyTest();
        t.testSelectStudentById(session);
        session.commit();
        session.close();
    }
    public void testSelectClazzById(SqlSession session){
        ClazzMapper cm = session.getMapper(ClazzMapper.class);
        Clazz clazz = cm.selectClazzById(1);
        System.out.println(clazz.getId() + " " + clazz.getCode() + " " + clazz.getName());
        List<Student> students = clazz.getStudents();
        for(Student stu:students){
            System.out.println(stu);
        }
    }
    public void testSelectStudentById(SqlSession session){
        StudentMapper sm = session.getMapper(StudentMapper.class);
        Student stu = sm.selectStudentById(1);
        System.out.println(stu);
        System.out.println(stu.getClazz());
    }
}
