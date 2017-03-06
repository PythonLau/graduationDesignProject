package com.petsHospital.test;

import com.petsHospital.factory.FKSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/6 0006.
 */
public class SelectMapTest {
    public static void main(String[] args) throws Exception{
        SqlSession session = FKSqlSessionFactory.getSqlSession();
        List<Map<String,Object>> list = session.selectList("mapper.UserMapper.selectAllUser");
        for(Map<String,Object> row : list){
            System.out.println(row);
        }
        session.commit();
        session.close();
    }
}
