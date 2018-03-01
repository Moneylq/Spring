package top.idalin.test;


import top.idalin.bean.Employee;
import top.idalin.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

/**
 * spring与JdbcTemplate实现对数据库的增删改查
 */
public class Spring_TemplateTest {

    // 创建一个IOC容器
    ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-config.xml");


    // 测试查询所有员工的方法
    @Test
    public void testQueryAll() {
        EmployeeService employeeService = (EmployeeService) ioc.getBean("employeeService");
        List<Employee> employees = employeeService.getEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    // 测试查询单个员工的方法
    @Test
    public void testQueryEmployee() {
        EmployeeService employeeService = (EmployeeService) ioc.getBean("employeeService");
        Employee employee = employeeService.getEmployee(2);
        System.out.println(employee);
    }
    // 测试增加一个员工的方法
    @Test
    public void testAddEmployee() {
        EmployeeService employeeService = (EmployeeService) ioc.getBean("employeeService");
        Employee employee = new Employee();
        employee.setLastName("zhaoliu");
        employee.setEmail("zhaoliu@qq.com");
        employee.setSalary(888.00);
        employee.setDeptId(2);
        employeeService.addEmployee(employee);
    }
    // 测试删除一个员工的方法
    @Test
    public void testDeleteEmployee() {
        EmployeeService employeeService = (EmployeeService) ioc.getBean("employeeService");
        employeeService.deleteEmployee(8);
    }
    // 测试修改员工信息的方法
    @Test
    public void testUpdateEmployee() {
        EmployeeService employeeService = (EmployeeService) ioc.getBean("employeeService");
        Employee employee = new Employee();
        employee.setId(1);
        employee.setLastName("admin");
        employee.setDeptId(1);
        employeeService.updateEmployee(employee);
    }
}
