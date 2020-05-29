//
package com.vti.FinalExam3rd.backend.businesslayer;

import com.vti.FinalExam3rd.backend.datalayer.EmployeeDAO;
import com.vti.FinalExam3rd.backend.datalayer.IEmployeeDAO;
import com.vti.FinalExam3rd.entity.Employee;


public class EmployeeService implements IEmployeeService {
	
	private IEmployeeDAO dao;

	public EmployeeService() {
		
		dao=new EmployeeDAO();
	}

	public boolean insertEmployee(Employee empl) {
		// TODO Auto-generated method stub
		return dao.insertEmployee(empl);
	}

}
