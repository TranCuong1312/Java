package BussinessLayer;

import DataLayer.DataAcessObj;
import DataLayer.InterfaceDataAcessObj;
import User.Trainess;

public class Buss implements InterfaceBuss {
	private InterfaceDataAcessObj dao;
	
	public Buss() {
		dao = new DataAcessObj();
	}

	@Override
	public boolean login(String account, String email) {
		// TODO Auto-generated method stub
		return dao.login(account, email);
	}

	@Override
	public boolean update(Trainess tr) {
		// TODO Auto-generated method stub
		return dao.update(tr);
	}

	@Override
	public boolean insert(Trainess tr) {
		// TODO Auto-generated method stub
		return dao.insert(tr);
	}
}
