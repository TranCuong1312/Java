//
package com.vti.FinalExam3rd.backend.presentationlayer;

import com.vti.FinalExam3rd.backend.businesslayer.IManagerService;
import com.vti.FinalExam3rd.backend.businesslayer.ManagerService;
import com.vti.FinalExam3rd.entity.Manager;


public class ManagerController {
	private IManagerService service;

	public ManagerController() {
		service = new ManagerService();
	}

	public boolean insertManager(Manager mn) {
		// TODO Auto-generated method stub
		return service.insertManager(mn);
	}
}
