package ltts.com.EmployeeApplication.repository;

import ltts.com.EmployeeApplication.entity.Employees;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpRepository extends MongoRepository<Employees,Integer> {
}
