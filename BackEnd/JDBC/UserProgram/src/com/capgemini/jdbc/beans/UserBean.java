package com.capgemini.jdbc.beans;

public class UserBean {

	private int userid;
	private String username;
	private String useremail;
	private String userpassword;

	public int getUserid() {
		return userid;
	}

	public String getUsername() {
		return username;
	}

	public String getUseremail() {
		return useremail;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	@Override
	public String toString() {
		return "UserBean [userid=" + userid + ", username=" + username + ", useremail=" + useremail+ "]";
	}

}
