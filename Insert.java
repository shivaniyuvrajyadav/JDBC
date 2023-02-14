import java.sql.DriverManager;

import java.sql.*;
public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("register & load Driver");
			
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=12345");
			 System.out.println("connection established");
			 
			 Statement stmt = con.createStatement();
			 System.out.println("platform created");
			 
			 stmt.executeUpdate("insert into product.info values(1,'shivani','clerk')");
			 System.out.println("data inserted");
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
