//
package com.vti.FinalExam3rd.backend.presentationlayer;

import com.vti.FinalExam3rd.backend.businesslayer.IUserService;
import com.vti.FinalExam3rd.backend.businesslayer.UserService;
import com.vti.FinalExam3rd.entity.User;


public class UserController {
	private IUserService service;

	public UserController() {
		service = new UserService();
	}

	public boolean login(String userName, String password) {
		return service.login(userName, password);
	}

	public boolean insertUser(User user) {
		User u = service.getUserByEmail(user.getEmail());
		if (u != null) {
			return false;
		} else {
			return service.insertUser(user);
		}
	}

	public User getUserByEmail(String email) {
		return service.getUserByEmail(email);
	}
}
