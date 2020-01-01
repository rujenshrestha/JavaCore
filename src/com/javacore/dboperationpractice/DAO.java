package com.javacore.dboperationpractice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {

	private PreparedStatement stmt;
	private ResultSet rs;
	private String query;
	private Connection con;
	private DBConnection dbConn = new DBConnection();
	
	public DAO(){
		this.con = dbConn.getDBConnection();
	}
	
	public List<DataModel> getAllEmployees(){
		
		List<DataModel> employees= new ArrayList<DataModel>();
		query = "SELECT * FROM EMPLOYEE";
		try {
			stmt = con.prepareStatement(query);
			rs = stmt.executeQuery();
			
			while(rs.next()){
				DataModel data = new DataModel();
				data.setEmpId(rs.getString("empId"));
				data.setEmpName(rs.getString("empName"));
				data.setEmpAddress(rs.getString("empAddress"));
				data.setEmpContact(rs.getString("empContact"));
				
				employees.add(data);
			}
		} catch (SQLException e) {
			System.out.println("getAllEmployees SQLException: "+e);
		}	
		
		return employees;
	}
}
