package com.simplilearn.preparedStat;

import java.sql.Connection;
import com.simplilearn.jdbc.util.JDBCUtil;

public class UpdatePrepearedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=JDBCUtil.getMySqlConnection();
			java.sql.PreparedStatement ps =  con.prepareStatement("UPDATE EMPLOYEE SET AGE=? WHERE ID = ? ");/* Place Holder */ 
			
			ps.setInt(1, 24);
			ps.setInt(2, 108);
			ps.executeUpdate();
			
			
			JDBCUtil.cleanup(con, ps);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
