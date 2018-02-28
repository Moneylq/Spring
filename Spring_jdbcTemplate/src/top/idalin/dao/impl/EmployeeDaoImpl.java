package top.idalin.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import top.idalin.bean.Employee;
import top.idalin.dao.EmployeeDao;

import java.util.List;
@Repository("emplooyeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Employee> getEmployees() {
        String sql = "select * from employees";
        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);

        List<Employee> employees = jdbcTemplate.query(sql, rowMapper);
        return employees;
    }

    @Override
    public Employee getEmployee(int id) {
        String sql = "select * from employees where id = ?";
        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
        Employee employee = jdbcTemplate.queryForObject(sql,rowMapper,id);
        return employee;
    }

    @Override
    public void addEmployee(Employee employee) {
        // 创建SQL语句
        String sql = "insert into employees(last_name,email,salary,dept_id) values(?,?,?,?)";
        jdbcTemplate.update(sql,employee.getLastName(),employee.getEmail(),employee.getSalary(),employee.getDeptId());
    }

    @Override
    public void deleteEmployee(int id) {
        String sql = "delete from employees where id = ?";
        jdbcTemplate.update(sql,id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        String sql = "update employees set last_name = ?,dept_id = ? where id = ?";
        jdbcTemplate.update(sql,employee.getLastName(),employee.getDeptId(),employee.getId());
    }
}
