package com.simplilearn.preparedStat;

import java.sql.Connection;

import com.simplilearn.jdbc.util.JDBCUtil;





public class PreparedStatement {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=JDBCUtil.getMySqlConnection();
			java.sql.PreparedStatement ps =  con.prepareStatement("INSERT INTO EMPLOYEE VALUES (?,?,?,?);");/* Place Holder */ 
			
			/*One Record*/
			ps.setInt(1, 108);
			ps.setInt(2, 19);
			ps.setString(3, "Anand");
			ps.setString(4, "Margur");
			ps.execute();
			
			
			/*Two Record*/
			ps.setInt(1, 109);
			ps.setInt(2, 17);
			ps.setString(3, "Phani");
			ps.setString(4, "kumar");
			ps.execute();
			
			
			/*Third Record*/
			ps.setInt(1, 113);
			ps.setInt(2, 13);
			ps.setString(3, "Munna");
			ps.setString(4, "Tripathi");
			
			ps.execute();
			
			JDBCUtil.cleanup(con, ps);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	}


