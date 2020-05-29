//
package com.vti.FinalExam3rd.backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vti.FinalExam3rd.DBConnect;
import com.vti.FinalExam3rd.entity.User;

public class UserDAO implements IUserDAO {

	public boolean login(String userName, String password) {
		Connection con;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con = DBConnect.openConnection();
		int dem = 0;
		try {
			pstmt = con.prepareStatement("select 1 from User where email=? and password=?");
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dem++;
			}
			if (dem == 1) {
				return true;
			}else {
				return false;
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnect.closeAll(con, pstmt, rs);
		}
		return false;
	}

	
	public boolean getUserById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public User getUserByEmail(String email) {
		Connection con;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con = DBConnect.openConnection();
		User u = new User();
		boolean bl = false;
		try {
			pstmt = con.prepareStatement("select * from User where email=?");
			pstmt.setString(1, email);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				bl=true;
				u.setUId(rs.getInt("uId"));
				u.setFirstName(rs.getString("firstName"));
				u.setLastName(rs.getString("lastName"));
				u.setPhone(rs.getString("phone"));
				u.setEmail(rs.getString("email"));
				u.setPassword("");
			}
			if(bl) {
				return u;	
			}else {
				return null;
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnect.closeAll(con, pstmt, rs);
		}
		
		return null;
	}

	
	public boolean insertUser(User user) {
		Connection con;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con = DBConnect.openConnection();
		try {
			pstmt = con.prepareStatement(
					"insert into User (firstName,lastName,phone,email,password) values (?,?,?,?,?)");
			
			pstmt.setString(1, user.getFirstName());
			pstmt.setString(2, user.getLastName());
			pstmt.setString(3, user.getPhone());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getPassword());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnect.closeAll(con, pstmt, rs);
		}
		return false;
	}

}
