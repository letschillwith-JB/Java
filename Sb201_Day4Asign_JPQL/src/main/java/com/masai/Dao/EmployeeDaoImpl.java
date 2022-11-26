package com.masai.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.Exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.utility.ProvideEntityManager;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		Employee emp = new Employee();
		EntityManager em = ProvideEntityManager.getEntityManager();
		
		emp.setName(employee.getName());
		emp.setSalary(employee.getSalary());
		emp.setAddress(employee.getAddress());
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		em.close();
		
		emp = em.find(Employee.class, emp.getEmpId());
		if(emp != null)return emp;
		else return null;
		
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		
		
		
		EntityManager em = ProvideEntityManager.getEntityManager();
		Query query = em.createQuery("select e from Employee e where empId = :empId");
		query.setParameter("empId", empId);
		Employee e  = (Employee)query.getSingleResult();
		return e;

//		Employee e = em.find(Employee.class, empId);
//		if(e==null)throw new EmployeeException("Employee not exist with empId "+empId);
//		else
//		return e;
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		EntityManager em = ProvideEntityManager.getEntityManager();
		Employee e1 = em.find(Employee.class, empId);
		
		if(e1 == null)throw new EmployeeException("No employee exist with empId "+empId);
		else {
			em.getTransaction().begin();
			em.remove(e1);
			em.getTransaction().commit();
			em.close();
		}
		
		return e1;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		EntityManager em = ProvideEntityManager.getEntityManager();
		Employee e1 = em.find(Employee.class, employee.getEmpId());
		
		if(e1 == null)throw new EmployeeException("No employee exist with empId "+employee.getEmpId());
		else {
			e1.setAddress(employee.getAddress());
			e1.setName(employee.getName());
			e1.setSalary(employee.getSalary());
			
			em.getTransaction().begin();
			em.persist(e1);
			em.getTransaction().commit();
			em.close();
		}
		
		return e1;
	}

}
