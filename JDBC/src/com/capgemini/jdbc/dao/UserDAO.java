package com.capgemini.jdbc.dao;

import java.util.List;

import com.capgemini.jdbc.beans.UserBean;

public interface UserDAO {

	
	public UserBean getInfo(int userid);
	public UserBean UserValidation (int userid,String password);
	public List<UserBean>getAllInfo();
}
