//update & delete the data using statement interface

import java.sql.DriverManager;
import java.sql.*;
public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("register & load Driver");
			
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=12345");
			 System.out.println("connection established");
			 
			 Statement stmt = con.createStatement();
			 System.out.println("platform created");
			 
			 stmt.executeUpdate("update product.info set pname='vani'where pid=1");
			 System.out.println("data updated");
			 
			 stmt.executeUpdate("delete from product.info where pid=1");
			 System.out.println("data deleted");
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
