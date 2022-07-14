package az.spring.hibernate.main;

import az.spring.hibernate.config.SpringHibernateConfig;
import az.spring.hibernate.dao.EmployeeDao;
import az.spring.hibernate.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HibernateApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringHibernateConfig.class);

        EmployeeDao employeeDao = applicationContext.getBean(EmployeeDao.class);

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Rehman");
        employee.setSurname("Sultanli");
        employee.setAge(20);
        employee.setSalary(1000);
        employeeDao.insert(employee);
    }

}
