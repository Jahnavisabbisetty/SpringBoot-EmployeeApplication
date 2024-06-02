package ltts.com.EmployeeApplication.service.impl;

import ltts.com.EmployeeApplication.entity.Employees;
import ltts.com.EmployeeApplication.repository.EmpRepository;
import ltts.com.EmployeeApplication.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpServiceImpl implements EmpService {


    @Autowired
    EmpRepository empRepository;


    public boolean addEmp(Employees emp) {

        empRepository.save(emp);
        return true;

    }

    public Optional<Employees> getEmpById(int empId) {

        return empRepository.findById(empId);
    }
}
