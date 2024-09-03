package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	private static Connection con=null;
	static
	{
		try
		{
			Class.forName(Provider.drive);
			con=DriverManager.getConnection(Provider.Connection_url,Provider.username,Provider.password);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static Connection getConnectionObj()
	{
		return con;
	}
	

}
