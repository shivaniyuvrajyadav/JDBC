//write a JDBC code to check whether the id is present in the database or not.

import java.sql.*;
import java.util.*;

public class Driver {
public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter id");
	   int id = sc.nextInt();
	   String inqry = "select*from employee.info where id =?";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver class loaded and registered");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=12345");
		System.out.println("connection established");
		
		//String qry;
		PreparedStatement pstmt = con.prepareStatement(inqry);
		
		

		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		System.out.println("driver");
//		System.out.println("Platform created ton execute sql query");
//		ResultSet rs = pstmt.executeQuery("");
		if(rs.next()) {
		
		System.out.print("id is:->"+rs.getInt(1));
		System.out.print("Name is:->"+rs.getString(2));
		System.out.print("infocol is:->"+rs.getString(3));
		System.out.print("role is:->"+rs.getString(4));
		
		
		}
		
		else {
			System.out.println("id not present");
		}
		
	}
	catch(Exception e) {
		System.out.println("jijerpoj[okp");
	}
}
}
