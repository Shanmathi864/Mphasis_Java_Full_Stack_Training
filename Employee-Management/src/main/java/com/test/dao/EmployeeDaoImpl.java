package com.test.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveEmployee(Employee emp) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(emp);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Employee> getEmployees() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Employee> query=currentSession.createQuery("from Employee", Employee.class);
		List<Employee> list=query.getResultList();
		return list;
	}

	@Override
	public boolean deleteEmployee(Employee emp) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(emp);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Employee> getEmployeeByID(Employee emp) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Employee> query=currentSession.createQuery("from Employee where id=:id", Employee.class);
		query.setParameter("id", emp.getId());
		List<Employee> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(emp);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

}
