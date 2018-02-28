package top.idalin.dao;

import top.idalin.bean.Employee;

import java.util.List;

public interface EmployeeDao {

    // 查询所有的员工信息的方法
    public List<Employee> getEmployees();

    public Employee getEmployee(int id);

    void addEmployee(Employee employee);

    void deleteEmployee(int id);

    void updateEmployee(Employee employee);
}
