//
package com.vti.FinalExam3rd.backend.businesslayer;

import com.vti.FinalExam3rd.entity.User;


public interface IUserService {
	boolean login(String userName, String password);
	boolean insertUser(User user);
	boolean getUserById(int id);
	User getUserByEmail(String email);
}
