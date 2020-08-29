package com.persistence;
import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import com.dao.LoginDAO;
import com.domain.*;
public class LoginDAOImpl extends HibernateDaoSupport implements LoginDAO {
	
	public boolean login(String username, String password) {
		System.out.println("username=" + username);
		System.out.println("password=" + password);
//		List<Users> u = this.getHibernateTemplate().find("from Users user where user.username=? and user.password =?",username,password);
		List<Users> u = this.getHibernateTemplate().find("from Users");
		boolean flag = false;
		System.out.println("flag=" + flag );
		System.out.println("u.size()=" + u.size() );
		if(u.size() > 0){
			flag = true;
			for(int i=0;i<u.size();i++){
				System.out.println(u.get(i).getRemark());
				}
		}
		return flag;
	}


}
