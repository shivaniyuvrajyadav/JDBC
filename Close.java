import java.util.*;
import java.sql.*;
public class Close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
        Statement stmt = null;
        try {
    		Class.forName("");
    		//System.out.println("driver class loaded and registered");
    		
    		 con = DriverManager.getConnection("");
    		//System.out.println("connection established");
    		
    	 stmt = con.createStatement();
    		//System.out.println("Platform created ton execute sql query");
    		
    		stmt.executeUpdate("");
    		//System.out.println("data inserted");
    		
    	}
    	catch(Exception e) {
    		System.out.println("jijerpoj[okp");
    	}
       finally {
    	   if(stmt!=null) {
    		   	 try {
    					con.close();
    				} catch (SQLException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    		    }
    		   	 if(con!=null) {
    		   		 try {
    		   			 con.close();
    		   		 }
    		   		 catch(SQLException e) {
    		   			 e.printStackTrace();
    		   		 }
    		   	 }
    		}
       }
       
       
	}
