package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CopyInsert {

	public static void main(String[] args) throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url,"system","admin");
		/*
		String q = "CREATE TABLE \"EMP_COPY\"(\"ID\" NUMBER(4,0) PRIMARY KEY,\"NAME\" VARCHAR2(30),\"SALARY\" NUMBER(8,2),\"COMMISSION\" NUMBER(8,2),\"ROLE\" VARCHAR2(30),\"DEPT_NO\" NUMBER(3,0),\"HIRED_DATE\" DATE,\"MANAGER_ID\" NUMBER(4,0))";
		PreparedStatement ps1 = con.prepareStatement(q);
		int i = ps1.executeUpdate();
		System.out.println("create table i: "+i);
		*/
		String query = "select * from emp";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			
			
			String q1 = "insert into emp_copy values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps2 = con.prepareStatement(q1);
			ps2.setInt(1,rs.getInt(1));
			ps2.setString(2,rs.getString(2));
			ps2.setDouble(3,rs.getDouble(3));
			ps2.setDouble(4,rs.getDouble(4));
			ps2.setString(5,rs.getString(5));
			ps2.setInt(6,rs.getInt(6));
			ps2.setDate(7,rs.getDate(7));
			ps2.setInt(8,rs.getInt(8));
			int x = ps2.executeUpdate();
			System.out.println("Successfully inserted x : "+x);
		}
		rs.close();
		ps.close();
		con.close();
		
	}

}
