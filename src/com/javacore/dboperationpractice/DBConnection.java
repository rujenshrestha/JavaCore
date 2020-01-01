package com.javacore.dboperationpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public Connection getDBConnection(){
		Connection con = null;
		String dbServerURL = "jdbc:mysql://localhost";
		String dbServerPortNo = "3306";
		String dbName = "practice";
		String dbUsername = "rujen";
		String dbPassword = "123456";
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); // MySQL JDBC Driver Class
			con = DriverManager.getConnection(dbServerURL+":"+dbServerPortNo+"/"+dbName,dbUsername,dbPassword);
		
		} catch (SQLException e) {
			System.out.println("Could not get DB Connection: "+e);
		} catch (ClassNotFoundException e){
			System.out.println("ClassNotFoundException: "+e);
		}
		return con;
	}

	public static void main(String[] args){
		DBConnection dbCon = new DBConnection();
		
		Connection con = dbCon.getDBConnection();
		System.out.println(con);
	}
}
