package com.petsHospital.test;

import com.petsHospital.domain.User;
import com.petsHospital.factory.FKSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2017/3/6 0006.
 */
public class ResultMapTest {
    public static void main(String[] args){
        SqlSession session = FKSqlSessionFactory.getSqlSession();
        List<User> user_list = session.selectList("mapper.UserMapper.selectUser2");
        for(User user : user_list){
            System.out.println(user);
        }
        session.commit();
        session.close();
    }
}
