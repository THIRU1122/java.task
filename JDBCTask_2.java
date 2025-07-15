package com.index;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.ResultSet;



public class JDBCTask_2 {
	
	static final String DB_URL= "jdbc:mysql://localhost:3306/employeenew";
	static final String USER = "root";
	static final String PASS ="bt15052003";
	

	public static void main(String[] args) {
		
		try {
			Connection conn1 = DriverManager.getConnection(DB_URL,USER,PASS);
			CallableStatement stmt = conn1.prepareCall
					("{call employeenew.proceed(?,?,?,?)}");
			
//			stmt.setInt(1,111);
//			stmt.setString(2,"arasu");
//			stmt.setString(3,"persu");
//			stmt. setString(4,"sirusu");
//			
//			stmt.executeQuery();
			System.out.println("records inserted");
			
		Statement stmt1= conn1.createStatement();
		String sql = "select * from emp2 order by 'desc limit 2'";
		stmt.executeQuery(sql);
		ResultSet  rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(	"emp ID :"+" "+rs.getInt(1));
			System.out.println("emp NAME:"+" "+rs.getString(2));
			System.out.println("emp DESIGNATION : "+" "+rs.getString(3));
			System.out.println("emp LOCATION :"+" "+rs.getString(4));
		}
	
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		   

		
	}

}
