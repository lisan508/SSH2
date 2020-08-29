package com.service;
import com.dao.RegisterDao;
import com.dao.RegisterService;

public class RegisterServiceImpl implements RegisterService{

	
	private RegisterDao registerDAO;

	public void setRegisterDAO(RegisterDao registerDAO) {
		this.registerDAO = registerDAO;
	}

	@Override
	public boolean register(String userName, String password, String realname,
			String age, String answer) {
		// TODO Auto-generated method stub
		return registerDAO.register(userName, password, realname, age, answer);
	}

}
