package com.capgemini.springmvc.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.springmvc.bean.EmployeeInfoBean;

@Repository
public class EmployeeDaoJpaImpl implements EmployeeDAO{
	
	@PersistenceUnit
	private EntityManagerFactory emf;// = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");	
	
	@Override
	public EmployeeInfoBean getEmployee(int empId) {
		
		EntityManager manager = emf.createEntityManager();
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);
		manager.close();
		return employeeInfoBean;
	}//End of getEmployee
	
	@Override
	public EmployeeInfoBean authenticate(int empid, String pwd) {	
		EntityManager manager = emf.createEntityManager();
		String jpql = "from EmployeeInfoBean where empid= :empid and password = :pwd";
		Query query = manager.createQuery(jpql);
		query.setParameter("empid", empid);
		query.setParameter("pwd", pwd);	
		EmployeeInfoBean employeeInfoBean = null;
		try {
		 employeeInfoBean = (EmployeeInfoBean)query.getSingleResult();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return employeeInfoBean;	
	}//End of authenticate
	
	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tx = manager.getTransaction();//because of whole object
		boolean isAdded = false;
		try {
		tx.begin();
		manager.persist(employeeInfoBean);
		tx.commit();
		isAdded=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return isAdded;
	}//End of AddEmployee() Method	
	

	
//	  @Override public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
//	  EntityManager manager = emf.createEntityManager(); employeeInfoBean =
//	  manager.find(EmployeeInfoBean.class, employeeInfoBean.getEmpid());
//	  if(employeeInfoBean != null) { if(employeeInfoBean.getEmpName() != null ) {
//	  employeeInfoBean.setEmpName(employeeInfoBean.getEmpName()); }
//	  if(employeeInfoBean.getAge()) {
//	  employeeInfoBean.setAge(employeeInfoBean.getAge()); }
//	  if(employeeInfoBean.getDesignation() != null) {
//	  employeeInfoBean.setDesignation(employeeInfoBean.getDesignation()); }
//	  if(employeeInfoBean.getGender()) {
//	  employeeInfoBean.setGender(employeeInfoBean.getGender()); }
//	  if(employeeInfoBean.getMobile()) {
//	  employeeInfoBean.setMobile(employeeInfoBean.getMobile()); }
//	  if(employeeInfoBean.getSalary()) {
//	  employeeInfoBean.setSalary(employeeInfoBean.getSalary()); }
//	  if(employeeInfoBean.get) }
//	  
//	  return employeeInfoBean; }//End of Update Employee
//	 
	
}//End of Main Method
