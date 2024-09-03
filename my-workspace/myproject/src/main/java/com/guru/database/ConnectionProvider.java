package com.guru.database;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionProvider {
	private static Connection con=null;
	static
	{
		try
		{
			Class.forName(DatabaseConnection.driver);
			con=DriverManager.getConnection(DatabaseConnection.connection_url,DatabaseConnection.username,DatabaseConnection.password);
			
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
