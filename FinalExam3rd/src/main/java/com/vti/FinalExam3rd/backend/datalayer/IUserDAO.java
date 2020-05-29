//
package com.vti.FinalExam3rd.backend.datalayer;

import com.vti.FinalExam3rd.entity.User;


public interface IUserDAO {
	boolean login(String userName, String password);
	boolean insertUser(User user);
	boolean getUserById(int id);
	User getUserByEmail(String email);
}
