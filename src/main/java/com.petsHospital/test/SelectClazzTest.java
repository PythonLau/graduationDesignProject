package com.petsHospital.test;

import com.petsHospital.domain.Clazz;
import com.petsHospital.domain.Student;
import com.petsHospital.factory.FKSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2017/3/6 0006.
 */
public class SelectClazzTest {
    public static void main(String[] args) throws Exception{
        SqlSession session = FKSqlSessionFactory.getSqlSession();
        List<Clazz> clazz_list = session.selectList("mapper.UserMapper.selectClazz");
        for(Clazz clazz : clazz_list){
            System.out.println(clazz);
            List<Student> student_list = clazz.getStudents();
            for(Student stu : student_list){
                System.out.println(stu.getId() + " " + stu.getName() + " " + stu.getSex() + " " + stu.getAge());
            }
        }
        session.commit();
        session.close();
    }
}
