package BussinessLayer;

import User.Trainess;

public interface InterfaceBuss {

	boolean login(String account, String email);

	boolean update(Trainess tr);

	boolean insert(Trainess tr);

	

}
