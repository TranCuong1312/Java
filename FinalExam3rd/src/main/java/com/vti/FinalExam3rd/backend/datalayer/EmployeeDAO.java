//
package com.vti.FinalExam3rd.backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vti.FinalExam3rd.DBConnect;
import com.vti.FinalExam3rd.entity.Employee;

public class EmployeeDAO implements IEmployeeDAO {

	public boolean insertEmployee(Employee empl) {
		Connection con;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con = DBConnect.openConnection();
		try {
			pstmt = con.prepareStatement(
					"insert into Employee (uId,projectName,proSkill) values (?,?,?)");
			pstmt.setInt(1, empl.getUser().getUId());
			pstmt.setString(2, empl.getProjectName());
			pstmt.setString(3, empl.getProSkill());
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
