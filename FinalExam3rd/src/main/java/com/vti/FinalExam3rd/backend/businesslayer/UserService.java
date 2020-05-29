//
package com.vti.FinalExam3rd.backend.businesslayer;

import com.vti.FinalExam3rd.backend.datalayer.IUserDAO;
import com.vti.FinalExam3rd.backend.datalayer.UserDAO;
import com.vti.FinalExam3rd.entity.User;


public class UserService implements IUserService {
	private IUserDAO dao;

	public UserService() {	
		dao=new UserDAO();;
	}

	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return dao.login(userName, password);
	}

	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		return dao.insertUser(user);
	}

	
	public boolean getUserById(int id) {
		// TODO Auto-generated method stub
		return dao.getUserById(id);
	}

	
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return dao.getUserByEmail(email);
	}

}
