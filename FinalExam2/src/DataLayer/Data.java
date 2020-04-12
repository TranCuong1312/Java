package DataLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Data {
	public void create(String firstname, String lastname, String phone, String email,String pass, int expinyear) throws SQLException {
		String projectname ="WORKSSS";
		String url ="jdbc:mysql://localhost:3306/" + projectname
				+ "?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String user ="root";
		String password="north";
		try {
			Connection connection = DriverManager.getConnection(url, user, password);

			String sql = "INSERT INTO IT(FIRSTNAME, LASTNAME, PHONE, EMAIL,`PASSWORD`, EXPINYEAR)"
						+ "VALUES(?,?,?,?,?,?)";

			PreparedStatement ps = connection.prepareStatement(sql);
			
			
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, phone);
			ps.setString(4, email);
			ps.setString(5, pass);
			ps.setInt(6, expinyear);
			ps.execute();
			System.out.println("Create success!");
			connection.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void login(String email,String pass) throws SQLException {
		String projectname ="WORKSSS";
		String url ="jdbc:mysql://localhost:3306/" + projectname
				+ "?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String user ="root";
		String password="north";
		try {
			Connection connection = DriverManager.getConnection(url, user, password);

			String sql1 = " SELECT EMAIL, `PASSWORD`"
						+ " FROM IT"
						+ " WHERE EMAIL=? AND `PASSWORD`=?";

			PreparedStatement ps = connection.prepareStatement(sql1);

			ps.setString(1, email);
			ps.setString(2, pass);
			
			

			ResultSet table = ps.executeQuery();
			while(table.next()) {
				System.out.println("login success");
			}
			
			
			
			connection.close();
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	
}
