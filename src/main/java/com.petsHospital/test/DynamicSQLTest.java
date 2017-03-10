package com.petsHospital.test;

import com.petsHospital.domain.Employee;
import com.petsHospital.factory.FKSqlSessionFactory;
import com.petsHospital.mapper.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/10 0010.
 */
public class DynamicSQLTest {
    public static void main(String[] args) throws Exception{
        SqlSession session = FKSqlSessionFactory.getSqlSession();
        DynamicSQLTest t = new DynamicSQLTest();
        EmployeeMapper em = session.getMapper(EmployeeMapper.class);
        t.testDeleteEmployee(em);
        session.commit();
        session.close();
    }
    public void testSelectWithParam(EmployeeMapper em){
        Map<String,Object> param = new HashMap<String,Object>();
        param.put("loginname","jack");
        param.put("password","123456");
        List<Employee> list = em.selectWithParm(param);
        for(Employee employee : list){
            System.out.println(employee.getName());
        }
    }
    public void testInsertEmployee(EmployeeMapper em){
        Employee e = new Employee();
        e.setLoginname("mary");
        e.setPassword("123456");
        e.setName("玛丽");
        e.setSex("女");
        e.setAge(20);
        e.setPhone("13902019999");
        e.setState("ACTIVE");
        e.setSal(9800.99);
        em.insertEmployee(e);
        System.out.println("插入成功,返回id: " + e.getId());
    }
    public void testUpdateEmployee(EmployeeMapper em){
        Map<String,Object> param = new HashMap<String,Object>();
        param.put("id",5);
        Employee e = em.selectEmployeeWithId(param);
        e.setLoginname("update");
        e.setPassword("fkjava");
        e.setName("测试");
        em.updateEmployee(e);
    }
    public void testDeleteEmployee(EmployeeMapper em){
        Map<String,Object> param = new HashMap<String,Object>();
        param.put("loginname","jack");
        param.put("password","123456");
        em.deleteEmployee(param);
    }
}
