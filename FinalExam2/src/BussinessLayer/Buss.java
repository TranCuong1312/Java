package BussinessLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import DataLayer.Data;

public class Buss implements iBuss{
	
	private Data dt;
	
	public Buss() {
		dt =new Data();
	}

	
	public void create(String firstname, String lastname, String phone, String email, String pass, int expinyear)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		dt.create(firstname, lastname, phone, email, pass, expinyear);
	}

	
	public void login(String email, String pass)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		dt.login(email, pass);
	}

}
