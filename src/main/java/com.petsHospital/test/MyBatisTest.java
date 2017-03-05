package com.petsHospital.test;

import com.petsHospital.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by Administrator on 2017/3/4 0004.
 */
public class MyBatisTest {
    public static void main(String[] args) throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        User user = new User("admin","男",22);
        session.insert("mapper.UserMapper.save",user);
        session.commit();
        session.close();
    }
}
