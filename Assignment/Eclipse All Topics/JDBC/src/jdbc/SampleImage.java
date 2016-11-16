package jdbc;

import java.io.*;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SampleImage {

	public static void main(String[] args) throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url,"system","admin");
		/*
		File file = new File("Desert.jpg");
		FileInputStream fis = new FileInputStream(file);
		
		
		String q = "insert into image_demo values(?,?)";
		PreparedStatement ps = con.prepareStatement(q);
		ps.setInt(1,222);
		ps.setBinaryStream(2, fis);
		
		int i = ps.executeUpdate();
		System.out.println("Successfully uploaded i : "+i);
		ps.close();
		*/
		
		String query = "select * from image_demo";
		PreparedStatement ps1 = con.prepareStatement(query);
		ResultSet rs = ps1.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+" | "+rs.getBlob("img"));
			
			Blob b = rs.getBlob("img");
			byte barr[]=b.getBytes(1,(int)b.length());
			
			File file = new File("temp.jpg");
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(barr);
		}
		
		
	}

}
