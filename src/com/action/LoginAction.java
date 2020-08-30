package com.action;

import com.dao.LoginService;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @author wjh4536
 *
 */
public class LoginAction extends ActionSupport{
	private LoginService loginservice;
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginService getLoginservice() {
		return loginservice;
	}

	public void setLoginservice(LoginService loginservice) {
		this.loginservice = loginservice;
	}

	public String login(){
		System.out.println("start ");
		boolean flag = loginservice.login(username, password);
		if(flag){
			return "Success";
		}else{
			return "input";
		}
	}
}

	
