package top.idalin.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.idalin.bean.Student;

public class TestStudent {

    /**
     * 创建一个spring的IOC容器
     * 其中Application是一个接口
     * ClassPathXmlApplicationContext是ApplicationContext子接口的实现类，这是一个典型的多态的体现
     * 方法参数就是spring-config.xml配置文件
     */
    ApplicationContext ioc =
            new ClassPathXmlApplicationContext("spring-config.xml");

    @Test
    public void testStudent() {
        // 通过ioc调用getBean()方法，创建一个Student对象
        // 参数是在spring-config.xml文件中bean的id值
        Student stu = (Student) ioc.getBean("student");
        // 打印stu，注意： 这时打印的stu对象是已经给对象中属性赋值了
        System.out.println(stu);
    }
}
