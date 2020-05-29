//
package com.vti.FinalExam3rd.backend.presentationlayer;

import com.vti.FinalExam3rd.backend.businesslayer.EmployeeService;
import com.vti.FinalExam3rd.backend.businesslayer.IEmployeeService;
import com.vti.FinalExam3rd.entity.Employee;


public class EmployeeController {
	private IEmployeeService service;

	public EmployeeController() {
		service = new EmployeeService();
	}

	public boolean insertEmployee(Employee empl) {
		// TODO Auto-generated method stub
		return service.insertEmployee(empl);
	}

}
