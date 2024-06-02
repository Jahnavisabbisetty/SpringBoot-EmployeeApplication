package ltts.com.EmployeeApplication.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="employees")
public class Employees {

    @Id
    private int empid;
    private String ename;
    private String dept;

    public Employees() {
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Employees{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
