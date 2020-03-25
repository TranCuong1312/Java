package DataLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Data2 implements interfaceData2 {
	/* This class is .
	*
	* @Description: .
	* @author: ManhCuong
	* @create_date: ${date}
	* @version: 1.0
	* @modifer: ManhCuong
	* @modifer_date: ${date}
	* ${tags}
	*/
	@Override
	public boolean register(String FirstName, String LastName, String Phone, String Email, String ProjectName,
			String ProSkill) {
		// TODO Auto-generated method stub
		String project="WORKSSS";
		String url="jdbc:mysql://localhost:3306/" + project
				+ "?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String user="root";
		String password="north";
		
		try {
			//Set connect
			Connection conn=DriverManager.getConnection(url, user, password);
			//Result
			ResultSet rs;
			//prepare Statement
			String sql1="INSERT INTO ITS(FIRSTNAME, LASTNAME, PHONE, EMAIL, PROJECTNAME,PROSKILL"
					+ "VALUES(?,?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql1);
			ps.setString(1,FirstName );
			ps.setString(2, LastName);
			ps.setString(3, Phone);
			ps.setString(4, Email);
			ps.setString(5,ProjectName);
			ps.setString(6, ProSkill);
			boolean table1 =ps.execute(sql1);
			while(table1) {
				System.out.println("FirstName: "+FirstName);
				System.out.println("LastName: "+ LastName);
				System.out.println("Phone: "+Phone);
				System.out.println("Email: "+Email);
				System.out.println("ProjectName: "+ProjectName);
				System.out.println("ProSkill: "+ProSkill);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean login(String FirstName, String Email) {
		// TODO Auto-generated method stub
		String project="WORKSSS";
		String url="jdbc:mysql://localhost:3306/" + project
				+ "?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String user="root";
		String password="north";
		
		try {
			Connection conn=DriverManager.getConnection(url, user, password);
			ResultSet rs;
			String sql1="SElECT FIRSTNAME, EMAIL"
					+ "FROM IT"
					+ "WHERE FIRSTNAME=? AND EMAIL=?;";
			PreparedStatement ps=conn.prepareStatement(sql1);
			ps.setString(1,FirstName );
			ps.setString(2, Email);
			
			ResultSet table1 =ps.executeQuery(sql1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}



