package top.idalin.service;


import top.idalin.bean.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getEmployees();

    public Employee getEmployee(int id);

    void addEmployee(Employee employee);

    void deleteEmployee(int id);

    void updateEmployee(Employee employee);
}
