package Pre;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import Buss.buss;
import Buss.ibuss;



public class pre {
	
	private ibuss b;
	
	public pre() {
		b= new buss();
	}

	public void createworkdone(int WORKDONEID, int EMPLOYEEID, int MODULEID, Date WORKDONEDATE,
			String WORKDONEDESCRIPTION, String WORKDONESTATUS)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		b.createworkdone(WORKDONEID, EMPLOYEEID, MODULEID, WORKDONEDATE, WORKDONEDESCRIPTION, WORKDONESTATUS);
	}
	
	public void login(String account, String firstname, String lastname, String email) 
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		b.login(account, firstname, lastname, email);
	}
}
