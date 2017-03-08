package com.petsHospital.mapper;

import com.petsHospital.domain.Employee;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/3/8 0008.
 */
public interface EmployeeMapper {
    List<Employee> selectEmployeeByIdLike(HashMap<String,Object> params);
    List<Employee> selectEmployeeByLoginLike(HashMap<String,Object> params);
    List<Employee> selectEmployeeChoose(HashMap<String,Object> params);
    List<Employee> selectEmployeeLike(HashMap<String,Object> params);
    Employee selectEmployeeWithId(Integer id);
    void updateEmployeeIfNecessary(Employee employee);
    List<Employee> selectEmployeeIn(List<Integer> ids);
    List<Employee> selectEmployeeLikeName(Employee employee);
}
