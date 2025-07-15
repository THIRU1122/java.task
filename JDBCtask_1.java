package com.index;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCtask_1 {
	
	static final String DB_URL ="jdbc:mysql://localhost:3306/employeenew";
    static final String USER = "root";
    static final String PASS ="bt15052003";
    
    static Connection conn1 = null;
    static final  String query= "select* from empnew";

	public static void main(String[] args) {
		
		try {
			conn1= DriverManager.getConnection(DB_URL,USER,PASS);
			Statement stmt = conn1.createStatement();
//			String sql = "select *from empnew limit 3";
			//String sql = "select *from empnew where First_name LIKE 'S%' ";
			//String sql = "select *from empnew where empdesgination LIKE 'testing%' ";
			//String sql = "select empnew where empdesgination LIKE 'testing%' ";
			String sql =  "SELECT * FROM empnew WHERE emplocation IN ("
                    + " SELECT emplocation FROM empnew GROUP BY emplocation HAVING COUNT(*) > 1"
                    + ")";


			stmt.executeQuery(sql);
			ResultSet rs1 =  stmt.executeQuery(sql); 
		while(rs1.next()) {
			System.out.println("empid:"+" "+rs1.getInt(1));
			System.out.println("First_name:"+" "+rs1.getString(2));
			System.out.println("empdesgination:"+" "+rs1.getString(3));
			System.out.println("emplocation:"+" "+rs1.getString(4));
			System.out.println("Last_name:"+" "+rs1.getString(5));

			
		}

	}catch(SQLException e){
		System.out.println(e);
		
	}

}
}

