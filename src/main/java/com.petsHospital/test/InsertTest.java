package com.petsHospital.test;


import com.petsHospital.domain.User;
import com.petsHospital.factory.FKSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by Administrator on 2017/3/6 0006.
 */
public class InsertTest {
    public static void main(String[] args) throws Exception{
        SqlSession session = FKSqlSessionFactory.getSqlSession();
        User user = new User("jack","男",22);
        session.insert("mapper.UserMapper.saveUser",user);
        session.commit();
        session.close();
    }
}
