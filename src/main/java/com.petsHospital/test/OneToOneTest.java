package com.petsHospital.test;

import com.petsHospital.domain.Person;
import com.petsHospital.factory.FKSqlSessionFactory;
import com.petsHospital.mapper.PersonMapper;
import org.apache.ibatis.session.SqlSession;


/**
 * Created by Administrator on 2017/3/6 0006.
 */
public class OneToOneTest {
    public static void main(String[] args) throws Exception{
        SqlSession session = FKSqlSessionFactory.getSqlSession();
        PersonMapper pm = session.getMapper(PersonMapper.class);
        Person p = pm.selectPersonById(1);
        System.out.println(p);
        System.out.println(p.getCard());
        session.commit();
        session.close();
    }
}
