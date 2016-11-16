package com.mockito.SampleMockito;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseOpr 
{
	
	public String getAllEmployees() throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection dbcon = 
DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
		Statement stmt = dbcon.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");
		List<Employee> empList = new ArrayList<Employee>();
		String ss="";
		while(rs.next()) {
			ss = rs.getString(2);
			Employee e = new Employee(rs.getInt("ID"), rs.getString("NAME"), rs.getDouble("SALARY"));
			empList.add(e);
		}
		return ss;
	}
	/*
	public static void main(String args[]) throws Exception {
		DatabaseOpr dbo = new DatabaseOpr();
		List<Employee> empList = dbo.getAllEmployees();
		System.out.println(empList);
	}
	*/
}
