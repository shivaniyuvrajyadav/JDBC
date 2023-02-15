//write a JDBC code to take the input from user using prepareStatement and store in the database.


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;

public class Placholder {
 
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id = sc.nextInt();
		
		System.out.println("enter name");
		String name = sc.next();
		
		System.out.println("enter surname");
        String surname = sc.next();		
		
		String query = "insert into college.info values(?,?,?)";
	  
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("load & register the driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=12345");
		System.out.println("connection established");
		
		PreparedStatement pstmt = con. prepareStatement(query);
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, surname);
		pstmt.executeUpdate();
		
		ResultSet rs = pstmt.executeQuery("select*from college.info");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
		
		
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
	}
}
