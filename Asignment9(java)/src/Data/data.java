package Data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class data {
	
	public void createworkdone(int WORKDONEID, int EMPLOYEEID, int MODULEID, Date WORKDONEDATE, String WORKDONEDESCRIPTION, String WORKDONESTATUS) throws SQLException {
		String projectname="WORKS";
		String url="jdbc:mysql://localhost:3306/" + projectname
				+ "?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String user="root";
		String password="north";
		
		Connection connection =DriverManager.getConnection(url, user, password);
		
		
		String sql="INSERT INTO WORKDONES(WORKDONEID, EMPLOYEEID, MODULEID, WORKDONEDATE, WORKDONEDESCRIPTION, WORKDONESTATUS)"
				+ "VALUES(?,?,?,?,?,?)";
		
		PreparedStatement ps= connection.prepareStatement(sql);
		
		ps.setInt(1, WORKDONEID);
		ps.setInt(2, EMPLOYEEID);
		ps.setInt(3, MODULEID);
		ps.setDate(4, WORKDONEDATE);
		ps.setString(5, WORKDONEDESCRIPTION);
		ps.setString(6, WORKDONESTATUS);
		
		ps.executeUpdate();
		
		connection.close();
	}
	
	public void login(String account, String firstname, String lastname, String email) throws SQLException {
		String projectname="WORKS";
		String url="jdbc:mysql://localhost:3306/" + projectname
				+ "?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String user="root";
		String password="north";
		
			Connection connection = DriverManager.getConnection(url, user, password);

			String sql1 = " SELECT `account`, firstname, lastname, email"
						+ " FROM login"
						+ " WHERE `account` = ? AND firstname =? AND lastname =? AND email = ?";

			PreparedStatement ps = connection.prepareStatement(sql1);

			ps.setString(1, account);
			ps.setString(2, firstname);
			ps.setString(3, lastname);
			ps.setString(4, email);
			

			ResultSet table = ps.executeQuery();
			while(table.next()) {
				System.out.println("login success");
			}
			
			
			
			connection.close();
			
		
			
			
		
		
	}

	
}
