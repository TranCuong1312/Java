package DataLayer;

import User.Trainess;

public interface InterfaceDataAcessObj {

	boolean login(String account, String email);

	boolean insert(Trainess tr);

	boolean update(Trainess tr);

}
