package mypack;
import java.sql.*;
public class sample {
    public static void main(String args[])
    {
	    	try
	    	{
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Guru@1253");
					String s="insert into student values(?,?,?,null)";
					PreparedStatement ps=con.prepareStatement(s);
					ps.setInt(1,1);
					ps.setString(2, "Guru");
					ps.setInt(3, 20);
					if(ps.executeUpdate()>0)
					{
						System.out.println("Query executed using prepared-Statement");
					}
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e);
	    	}
    	}
}
