package com.petsHospital.test;

import com.petsHospital.factory.FKSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by Administrator on 2017/3/6 0006.
 */
public class DeleteTest {
    public static void main(String[] args) throws Exception{
        SqlSession session = FKSqlSessionFactory.getSqlSession();
        session.delete("mapper.UserMapper.removeUser",1);
        session.commit();
        session.close();
    }
}
