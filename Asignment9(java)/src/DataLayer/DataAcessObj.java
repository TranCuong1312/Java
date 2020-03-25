package DataLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import User.Trainess;

public class DataAcessObj implements InterfaceDataAcessObj {

	@Override
	public boolean login(String account, String email) {
		String projectname="WORKSS";
		String url="jdbc:mysql://localhost:3306/" + projectname
				+ "?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String user="root";
		String password="north";
		try {
			Connection conn= DriverManager.getConnection(url, user, password);
			ResultSet rs;
			String sql1="SELECT `ACCOUNT`, EMAIL FROM TRAINEES WHERE `ACCOUNT`= ? AND EMAIL=?;";
			PreparedStatement ps=conn.prepareStatement(sql1);
			ps.setString(1, account);
			ps.setString(2, email);
			ResultSet table1 =ps.executeQuery(sql1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean insert(Trainess tr) {
		// TODO Auto-generated method stub
		String projectname="WORKSS";
		String url="jdbc:mysql://localhost:3306/" + projectname
				+ "?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String user="root";
		String password="north";
		try {
			Connection conn= DriverManager.getConnection(url, user, password);
			ResultSet rs;
			String sql2="INSERT INTO TRAINEES(`ACCOUNT`, FIRSTNAME, LASTNAME, EMAIL) VALUES(?,?,?,?);";
			PreparedStatement ps=conn.prepareStatement(sql2);
			ps.setString(1, tr.getAccount());
			ps.setString(2,tr.getFirstName());
			ps.setString(3, tr.getLastName());
			ps.setString(4, tr.getEmail());
			ResultSet table2=ps.executeQuery();
			while(table2.next()) {
				System.out.println("Account: "+tr.getAccount());
				System.out.println("FirstName: "+tr.getFirstName());
				System.out.println("LastName: "+tr.getLastName());
				System.out.println("Email: "+tr.getEmail());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Trainess tr) {
		// TODO Auto-generated method stub
		String projectname="WORKSS";
		String url="jdbc:mysql://localhost:3306/" + projectname
				+ "?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String user="root";
		String password="north";
		try {
			Connection conn= DriverManager.getConnection(url, user, password);
			ResultSet rs;
			String sql3="UPDATE TRAINEES SET `ACCOUNT`=?, FIRSTNAME=?,LASTNAME=?,EMAIL=?;";
			PreparedStatement ps=conn.prepareStatement(sql3);
			ps.setString(1, tr.getAccount());
			ps.setString(2,tr.getFirstName());
			ps.setString(3, tr.getLastName());
			ps.setString(4, tr.getEmail());
			ResultSet table2=ps.executeQuery();
			while(table2.next()) {
				System.out.println("Account: "+tr.getAccount());
				System.out.println("FirstName: "+tr.getFirstName());
				System.out.println("LastName: "+tr.getLastName());
				System.out.println("Email: "+tr.getEmail());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
