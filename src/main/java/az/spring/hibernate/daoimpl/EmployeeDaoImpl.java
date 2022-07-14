package az.spring.hibernate.daoimpl;

import az.spring.hibernate.dao.EmployeeDao;
import az.spring.hibernate.model.Employee;
import com.mysql.cj.xdevapi.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

@Repository
public class EmployeeDaoImpl extends AbstractSessionFactory implements EmployeeDao {


    @Transactional
    @Override
    public void insert(Employee employee) {
        getSession().save(employee);
    }

    @Transactional
    @Override
    public void update(Employee employee) {
        getSession().update(employee);
    }

    @Transactional
    @Override
    public void delete(int id) {
        getSession().delete(getEmployeeByID(id));
    }

    @Transactional
    @Override
    public Employee getEmployeeByID(int id) {
        return getSession().get(Employee.class, id);
    }

    @Transactional
    @Override
    public List<Employee> getAllEmployees() {
        return getSession().createQuery("select e from emp e").list();
    }
}
