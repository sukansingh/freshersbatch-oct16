package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SampleBatch {

	public static void main(String[] args) throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url,"system","admin");
		
		String query = "select * from emp";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		Statement st = con.createStatement();
		//st.addBatch("Insert into EMP_COPY (ID,NAME,SALARY,COMMISSION,ROLE,DEPT_NO,HIRED_DATE,MANAGER_ID) values (2,'Jerry',25000,10000,'Manager',4,null,3)");
		//st.addBatch("Insert into EMP_COPY (ID,NAME,SALARY,COMMISSION,ROLE,DEPT_NO,HIRED_DATE,MANAGER_ID) values (3,'Ivan',50000,20000,'President',3,null,null)");
		//st.addBatch("Insert into EMP_COPY (ID,NAME,SALARY,COMMISSION,ROLE,DEPT_NO,HIRED_DATE,MANAGER_ID) values (4,'Robert',22000,8000,'Manager',1,null,6)");
		while(rs.next())
		{
			st.addBatch("Insert into EMP_COPY (ID,NAME,SALARY,COMMISSION,ROLE,DEPT_NO,HIRED_DATE,MANAGER_ID) values ("+rs.getInt("ID")+","+rs.getString("NAME")+","+rs.getDouble("SALARY")+","+rs.getDouble("COMMISSION")+","+rs.getString("ROLE")+","+rs.getInt("DEPT_NO")+","+rs.getDate("HIRED_DATE")+","+rs.getInt("MANAGER_ID")+")");
			
		}
		
		int x[] = st.executeBatch();
		for(int i=0;i<x.length;i++)
			System.out.println("Successfully inserted x : "+x[i]);
		rs.close();
		st.close();
		ps.close();
		con.close();
	}

}
