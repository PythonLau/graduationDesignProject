package com.petsHospital.test;

import com.petsHospital.domain.User;
import com.petsHospital.factory.FKSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by Administrator on 2017/3/6 0006.
 */
public class UpdateTest {
    public static void main(String[] args) throws Exception{
        SqlSession session = FKSqlSessionFactory.getSqlSession();
        User user = session.selectOne("mapper.UserMapper.selectUser",1);
        user.setName("tom");
        user.setAge(25);
        session.update("mapper.UserMapper.modifyUser",user);
        session.commit();
        session.close();
    }
}
