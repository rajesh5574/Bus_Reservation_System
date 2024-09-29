package com.busreservation;
import java.sql.*;

public class DbConnection{
     
	private static final String url="jdbc:mysql://localhost:3310/busreservation";
	private static final String username ="root";
	private static final String password = "raj_137_rocky";
	
	public static Connection getConnection() throws SQLException{
		
		return DriverManager.getConnection(url,username,password);
	}
}
