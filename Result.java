//insert the records in database using prepared statement & fetch the data from database.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class Result {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
     try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("load & register driver");
		
		Connection con   =  DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=12345");
		System.out.println("connection established");
		
		PreparedStatement pstmt = con.prepareStatement("insert into college.info values(9,'shivani','yadav')");
		System.out.println("data inserted");
		
		ResultSet rs = pstmt.executeQuery("select*from college.info");
		
		while(rs.next()) {
			System.out.print("id = "+ rs.getInt(1));
			System.out.print(" ");
			System.out.print("name = "+ rs.getString(2));
			System.out.print(" ");
			System.out.print("surname = "+ rs.getString(3));
			System.out.print(" ");
		}
		

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	

}
