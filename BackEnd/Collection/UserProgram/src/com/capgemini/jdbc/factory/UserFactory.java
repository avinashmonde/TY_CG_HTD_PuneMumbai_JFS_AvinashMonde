package com.capgemini.jdbc.factory;


import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.dao.UserDAOjdbcImp;

public class UserFactory {

	private UserFactory() {
 
	}
	public static UserDAO getInstance()
	{
		UserDAO dao = new UserDAOjdbcImp();
		return dao;
		
	}
}
