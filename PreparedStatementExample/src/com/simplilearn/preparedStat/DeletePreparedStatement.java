package com.simplilearn.preparedStat;

import java.sql.Connection;

import com.simplilearn.jdbc.util.JDBCUtil;

public class DeletePreparedStatement {
	
	public static void main(String[] args) {
		System.out.println("*******Start Deleting******");
	
		try {
			Connection con=JDBCUtil.getMySqlConnection();
			java.sql.PreparedStatement ps =  con.prepareStatement("DELETE FROM EMPLOYEE WHERE ID = ?; ");/* Place Holder */ 
			
			ps.setInt(1, 113);
			ps.executeUpdate();
			
			
			JDBCUtil.cleanup(con, ps);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("*******End Deleting******");
	}

}
