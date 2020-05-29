//
package com.vti.FinalExam3rd.backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vti.FinalExam3rd.DBConnect;
import com.vti.FinalExam3rd.entity.Manager;


public class ManagerDAO implements IManagerDAO {

	public boolean insertManager(Manager mn) {
		Connection con;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con = DBConnect.openConnection();
		try {
			pstmt = con.prepareStatement(
					"insert into Manager (uid,expInYear) values (?,?)");
			pstmt.setInt(1, mn.getUser().getUId());
			pstmt.setInt(2, mn.getExpInYear());
			
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
