package ltts.com.EmployeeApplication.controller;


import ltts.com.EmployeeApplication.entity.Employees;
import ltts.com.EmployeeApplication.exception.ResourceNotFoundException;
import ltts.com.EmployeeApplication.response.ResponseHandler;
import ltts.com.EmployeeApplication.service.impl.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmpController {

    @Autowired
    EmpServiceImpl empServiceImpl;


    @PostMapping("/add")
    public ResponseEntity<Object> addEmp(Employees emp)throws ResourceNotFoundException
    {
        if(empServiceImpl.addEmp(emp))
        {
            return ResponseHandler.resBuilder("New Employee created successfully...", HttpStatus.CREATED);
        }
        throw new ResourceNotFoundException("There is no data exists to add");
    }


    @GetMapping("/getEmp/{empId}")
    public ResponseEntity<Object> getEmpById(@PathVariable int empId)throws ResourceNotFoundException
    {
        Optional<Employees>e=empServiceImpl.getEmpById(empId);
        if(e.isEmpty())
        {
            return new ResponseEntity<>(e,HttpStatus.FOUND);
        }
        throw new ResourceNotFoundException("There is no employee exists with the given employee id:"+empId);
    }
}
