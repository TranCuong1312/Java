package BussinessLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public interface iBuss2 {
	void create(String firstname, String lastname, String phone, String email,String pass, String project, String proskill)
		throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;

	void login(String email,String pass) 
		throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
}
