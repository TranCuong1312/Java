//
package com.vti.FinalExam3rd.backend.businesslayer;

import com.vti.FinalExam3rd.backend.datalayer.IManagerDAO;
import com.vti.FinalExam3rd.backend.datalayer.ManagerDAO;
import com.vti.FinalExam3rd.entity.Manager;


public class ManagerService implements IManagerService {
private IManagerDAO dao;

	public ManagerService() {	
		dao=new ManagerDAO();
	}

	public boolean insertManager(Manager mn) {
		// TODO Auto-generated method stub
		return dao.insertManager(mn);
	}

}
