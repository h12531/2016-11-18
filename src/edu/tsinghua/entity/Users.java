
package edu.tsinghua.entity;

import java.io.Serializable;

public class Users implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userId;
	private String loginName;
	private String loginPwd;
	private String telephone;
	private String userName;
	private String isAdmin;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	public Users() {
		super();
	}
	public Users(int userId) {
		super();
		this.userId = userId;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Users(int userId, String loginName, String loginPwd, String telephone, String userName, String isAdmin) {
		super();
		this.userId = userId;
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.telephone = telephone;
		this.userName = userName;
		this.isAdmin = isAdmin;
	}
	public Users(String loginName, String loginPwd, String telephone, String userName, String isAdmin) {
		super();
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.telephone = telephone;
		this.userName = userName;
		this.isAdmin = isAdmin;
	}
	
	
}
