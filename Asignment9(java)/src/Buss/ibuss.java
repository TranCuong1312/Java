package Buss;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

public interface ibuss {
	void createworkdone(int WORKDONEID, int EMPLOYEEID, int MODULEID, Date WORKDONEDATE, String WORKDONEDESCRIPTION, String WORKDONESTATUS)
	throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;

	void login(String account, String firstname, String lastname, String email) 
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
}
