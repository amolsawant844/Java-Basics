package Create;
import java.sql.*;
public class createtable
{
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";// driver gets to know on which platform u r working(mac ,win,linux)  
	   static final String DB_URL = "jdbc:mysql://localhost/student";//send the workbench a connection address
	   static final String USER = "root";
	   static final String PASS = "root";
	   public static void main (String args[])
	   {
		   Connection conn=null;
		   Statement stmt = null;
		   try
		   {
		   Class.forName("com.mysql.jdbc.Driver");
		   System.out.println("Connecting to a selected database...");
		   conn = DriverManager.getConnection(DB_URL, USER, PASS);
		   System.out.println("Connected database successfully...");
		   System.out.println("Creating table in given database...");
		   stmt = conn.createStatement();
		   
		    String sql = "CREATE TABLE REGISTRATION2" +
		                   "(id INTEGER not NULL, " +
		                   " first VARCHAR(255), " + 
		                   " last VARCHAR(255), " + 
		                   " age INTEGER, " + 
		                   " PRIMARY KEY ( id ))"; 
		    
		   stmt.executeUpdate(sql);
		   System.out.println("a table has been created");
		   
		     
		      
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
		   }
		   
	   }


}
