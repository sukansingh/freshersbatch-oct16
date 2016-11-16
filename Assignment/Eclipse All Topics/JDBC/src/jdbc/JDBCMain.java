package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCMain {

	public static void main(String[] args) throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url,"system","admin");
		
		String q = "update dept set name=? where id=?";
		PreparedStatement ps1 = con.prepareStatement(q);
		ps1.setString(1,"RnD");
		ps1.setInt(2,3);
		ps1.executeUpdate();
		
		String query = "select * from dept";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" | "+rs.getString(2));
		}
	}

}
