package ltts.com.EmployeeApplication.service;

import ltts.com.EmployeeApplication.entity.Employees;

import java.util.Optional;

public interface EmpService {

    boolean addEmp(Employees emp);
    Optional<Employees>getEmpById(int empid);
}
