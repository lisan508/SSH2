package com.persistence;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.*;

public class RegisterDaoImpl extends HibernateDaoSupport implements RegisterDao{

	@Override
	public boolean register(String userName, String password, String realname,
			String age, String answer) {
		// TODO Auto-generated method stub
		return false;
	}

}
