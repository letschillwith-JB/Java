package com.masai.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.Exceptions.EmployeeException;
import com.masai.Utility.ProvideConnection;
import com.masai.models.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		EntityManager em = ProvideConnection.getConnection() ;
		Query q1 = em.createQuery("from Employee");
		List<Employee> list = q1.getResultList();
		if(list == null) throw new EmployeeException("No employee found ...");
		
		return list;
	}

	@Override
	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {
		EntityManager em = ProvideConnection.getConnection() ;
		Query q1 = em.createQuery("from Employee e where address = :add");
		q1.setParameter("add", address);
		List<Employee> list = q1.getResultList();
		if(list == null) throw new EmployeeException("No employee found ...");
	
		return list;
	}

	@Override
	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException {
		EntityManager em = ProvideConnection.getConnection() ;
		Query q1 = em.createQuery("from Employee where salary BETWEEN :a AND :b");
		q1.setParameter("a", startSalary);
		q1.setParameter("b", endSalary);
		List<Employee> list = q1.getResultList();
		if(list == null) throw new EmployeeException("No employee found ...");
		
		return list;
	}

	@Override
	public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException {
		EntityManager em = ProvideConnection.getConnection() ;
		Employee emp = em.find(Employee.class, empId);
		if(emp == null) throw new EmployeeException("No employee found ...");
		
		Object[] arr = {emp.getName(),emp.getAddress()};
		
		return arr;
	}

	@Override
	public int getEmployeeSalaryById(int empId) throws EmployeeException {
		
		EntityManager em = ProvideConnection.getConnection() ;
		Employee emp = em.find(Employee.class, empId);
		if(emp == null) throw new EmployeeException("No employee found ...");
		int salary = emp.getSalary();
		
		return salary;
	}

}
