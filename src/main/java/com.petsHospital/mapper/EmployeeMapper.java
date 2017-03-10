package com.petsHospital.mapper;

import com.petsHospital.domain.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/10 0010.
 */
public interface EmployeeMapper {
    @SelectProvider(type = EmployeeDynaSqlProvider.class,method = "selectWithParam")
    List<Employee> selectWithParm(Map<String,Object> param);
    @InsertProvider(type=EmployeeDynaSqlProvider.class,method = "insertEmployee")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    int insertEmployee(Employee employee);
    @SelectProvider(type=EmployeeDynaSqlProvider.class,method = "selectWithParam")
    Employee selectEmployeeWithId(Map<String,Object> param);
    @UpdateProvider(type=EmployeeDynaSqlProvider.class,method = "updateEmployee")
    void updateEmployee(Employee employee);
    @DeleteProvider(type=EmployeeDynaSqlProvider.class,method = "deleteEmployee")
    void deleteEmployee(Map<String,Object> param);
}
