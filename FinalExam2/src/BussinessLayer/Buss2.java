package BussinessLayer;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import DataLayer.Data2;

public class Buss2 implements iBuss2 {
private Data2 dt2;
	
	public Buss2() {
		dt2 =new Data2();
	}


	public void create(String firstname, String lastname, String phone, String email, String pass, String project,
			String proskill) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		dt2.create(firstname, lastname, phone, email, pass, project, proskill);
	}

	
	public void login(String email, String pass)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		dt2.login(email, pass);
	}
}
