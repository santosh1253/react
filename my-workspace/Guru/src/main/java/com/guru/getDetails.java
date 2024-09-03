package com.guru;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import database.ConnectionProvider;

public class getDetails {
	public static void getData()
	{
		try
		{
			Connection con=ConnectionProvider.getConnectionObj();
			Statement ps=con.createStatement();
		    ResultSet rs=ps.executeQuery("select *from stud");
		    ResultSetMetaData rsmd = rs.getMetaData();
		    int columnsNumber = rsmd.getColumnCount();
		    while (rs.next()) {
		        for (int i = 1; i <= columnsNumber; i++) {
		            if (i > 1) System.out.print(",  ");
		            String columnValue = rs.getString(i);
		            System.out.print(columnValue + " " + rsmd.getColumnName(i));
		        }
		        System.out.println("");
		    }
			
		}
		catch(Exception exp)
		{
			exp.printStackTrace();;
		}
		//return status;
	}

}
