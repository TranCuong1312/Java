//
package com.vti.FinalExam3rd.frontend;

import java.util.Scanner;

import com.vti.FinalExam3rd.backend.presentationlayer.EmployeeController;
import com.vti.FinalExam3rd.backend.presentationlayer.ManagerController;
import com.vti.FinalExam3rd.backend.presentationlayer.UserController;
import com.vti.FinalExam3rd.entity.Employee;
import com.vti.FinalExam3rd.entity.Manager;
import com.vti.FinalExam3rd.entity.User;
import com.vti.FinalExam3rd.utils.ScannerUtil;


public class Function {
	public void Login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Username:");
		String username = ScannerUtil.readEmail(sc, "error");
		System.out.println("Password:");
		String password = ScannerUtil.readPassword(sc, "error");
		boolean bl = new UserController().login(username, password);
		if (bl) {
			System.out.println("Login success!");
		}else {
			System.out.println("Login fail!");
		}
	}

	public void createManager() {
		User u = new User();
		Manager mn = new Manager();
		u.input();
		mn.input(u);
		boolean bl = new UserController().insertUser(u);
		if (bl) {
			mn.setUser(new UserController().getUserByEmail(u.getEmail()));
			boolean bl1 = new ManagerController().insertManager(mn);
			if (bl1) {
				System.out.println("Created!");
			} else {
				System.out.println("Not created");
			}
		} else {
			System.out.println("Invail email");
		}
	}

	public void createEmployee() {
		User u = new User();
		Employee empl = new Employee();
		u.input();
		empl.input(u);
		boolean bl = new UserController().insertUser(u);
		if (bl) {
			empl.setUser(new UserController().getUserByEmail(u.getEmail()));
			boolean bl1 = new EmployeeController().insertEmployee(empl);
			if (bl1) {
				System.out.println("Created");
			} else {
				System.out.println("Not created");
			}
		} else {
			System.out.println("Create User fail");
		}
	}
}
