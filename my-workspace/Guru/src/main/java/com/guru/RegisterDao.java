package com.guru;

import java.sql.Connection;
import java.sql.PreparedStatement;

import database.ConnectionProvider;

public class RegisterDao {
	public static int register(Employee e)
	{
		int status=0;
		try
		{
			Connection con=ConnectionProvider.getConnectionObj();
			PreparedStatement ps=con.prepareStatement("insert into stud values(?,?)");
			ps.setString(1,e.getName());
			ps.setString(2,e.getEmail());
			status=ps.executeUpdate();
		}
		catch(Exception exp)
		{
			exp.printStackTrace();;
		}
		return status;
	}

}
