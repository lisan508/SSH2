package com.service;

import com.dao.LoginDAO;
import com.dao.LoginService;


public class LoginServiceImpl  implements LoginService {

	private LoginDAO logindao;
	
	public void setLogindao(LoginDAO logindao) {
		this.logindao = logindao;
	}
	public boolean login(String username, String password) {
		return logindao.login(username, password);
	}
}
