package com.simplilearn.preparedStat;

import java.sql.Connection;
import java.sql.ResultSet;

import com.simplilearn.jdbc.util.JDBCUtil;

public class GetPrepearedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=JDBCUtil.getMySqlConnection();
		// 1.Geting only one record
			java.sql.PreparedStatement ps =  con.prepareStatement("SELECT * FROM EMPLOYEE WHERE ID=?;");
			ps.setInt(1, 100);
			
			//2. Get all records present in DB
			
		//	java.sql.PreparedStatement ps =  con.prepareStatement("SELECT * FROM EMPLOYEE;");
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("ID-"+rs.getInt(1)+" "+"AGE-"+rs.getInt(2)+" "
			            +"First name-"+rs.getString(3)+" "+"Last name-"+rs.getString(4));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
