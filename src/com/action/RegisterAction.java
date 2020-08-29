package com.action;

import com.dao.LoginService;
import com.dao.RegisterService;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	
	
	private String userName;
	private String password;
	private String realname;
	private String age;
	private String answer;
	private RegisterService registerService;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getRealname() {
		return realname;
	}




	public void setRealname(String realname) {
		this.realname = realname;
	}




	public String getAge() {
		return age;
	}




	public void setAge(String age) {
		this.age = age;
	}




	public String getAnswer() {
		return answer;
	}




	public void setAnswer(String answer) {
		this.answer = answer;
	}




	public RegisterService getRegisterService() {
		return registerService;
	}




	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}
	
	public String register(){
		boolean flag = registerService.register(userName, password, realname, age, answer);
		if(flag){
			return "Success";
		}else{
			return "fail";
		}
	}

}
