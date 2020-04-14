package Buss;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import Data.data;



public class buss implements ibuss{
	
	private data dt;
	
	public buss(){
		dt = new data();
	}

	public void createworkdone(int WORKDONEID, int EMPLOYEEID, int MODULEID, Date WORKDONEDATE,
			String WORKDONEDESCRIPTION, String WORKDONESTATUS)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		dt.createworkdone(WORKDONEID, EMPLOYEEID, MODULEID, WORKDONEDATE, WORKDONEDESCRIPTION, WORKDONESTATUS);
	}

	public void login(String account, String firstname, String lastname, String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		dt.login(account, firstname, lastname, email);
	}
	

}
