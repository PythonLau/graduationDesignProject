package com.petsHospital.test;

import com.petsHospital.domain.Employee;
import com.petsHospital.factory.FKSqlSessionFactory;
import com.petsHospital.mapper.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/3/8 0008.
 */
public class DynamicSQLTest {
    public static void main(String[] args) throws Exception{
        SqlSession session = FKSqlSessionFactory.getSqlSession();
        DynamicSQLTest t = new DynamicSQLTest();
        t.testSelectEmployeeLikeName(session);
        session.commit();
        session.close();
    }
    public void testSelectEmployeeByIdLike(SqlSession session){
        EmployeeMapper em = session.getMapper(EmployeeMapper.class);
        HashMap<String,Object> params = new HashMap<String,Object>();
        params.put("id",1);
        params.put("loginname","jack");
        params.put("password","123456");
        List<Employee> list = em.selectEmployeeLike(params);
        for(Employee employee : list){
            System.out.println(employee);
        }
    }
    public void testUpdateEmployeeIfNecessary(SqlSession session){
        EmployeeMapper em = session.getMapper(EmployeeMapper.class);
        Employee employee = em.selectEmployeeWithId(4);
        employee.setLoginname("mary");
        employee.setPassword("123");
        employee.setName("玛丽");
        em.updateEmployeeIfNecessary(employee);
    }
    public void testSelectEmployeeIn(SqlSession session){
        EmployeeMapper em = session.getMapper(EmployeeMapper.class);
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        System.out.println(ids);
        List<Employee> list = em.selectEmployeeIn(ids);
        for(Employee employee : list){
            System.out.println(employee.getName());
        }
    }
    public void testSelectEmployeeLikeName(SqlSession session){
        EmployeeMapper em = session.getMapper(EmployeeMapper.class);
        Employee employee = new Employee();
        employee.setName("o");
        List<Employee> list = em.selectEmployeeLikeName(employee);
        System.out.println(list);
    }
}
