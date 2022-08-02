import java.util.*;
import java.sql.*;



public class FirstClass {
	
	@SuppressWarnings("deprecation")
	public static void main(String arg[])
	{
		Connection con=null;
		String f1,f2;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql1","root","");
			if(!con.isClosed())
			{
				System.out.println("Succesfully connected to database server.....");
				
			}
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM sq");
			
			while(rs.next())
			{
				//int id=rs.getInt("");
				String name=rs.getString("name");
				System.out.println(" "+name);
			}
			
		}
		catch(Exception e)
		{
			System.err.println("Exception:"+e.getMessage());
		}
		
	}
		
		
		
		
}


