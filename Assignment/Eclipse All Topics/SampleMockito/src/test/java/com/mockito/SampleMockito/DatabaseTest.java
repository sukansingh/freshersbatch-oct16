package com.mockito.SampleMockito;

import static org.mockito.Mockito.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Rule;

//import java.util.LinkedList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import junit.framework.Assert;

@RunWith(PowerMockRunner.class)
@PrepareForTest
public class DatabaseTest 
{
	@Mock
    public static Connection con;
	
	@Mock
    public static Statement st;
	
	@Mock
    public static ResultSet rs;
	

    @BeforeClass
    public static void test() throws Exception  
    {
    	DatabaseOpr databaseMock = mock(DatabaseOpr.class); 
    	
    	List <Employee> arr = new ArrayList<Employee>();
    	DatabaseOpr t = new DatabaseOpr();
    	
    	 con = mock(Connection.class);
         st = mock(Statement.class);
         rs = mock(ResultSet.class);
         PowerMockito.mockStatic(DriverManager.class);
        
         when(DriverManager.getConnection(anyString(),anyString(),anyString())).thenReturn(con);
         when(con.createStatement()).thenReturn(st);
         when(st.executeQuery(anyString())).thenReturn(rs);
         when(rs.next()).thenReturn(true);
         when(rs.getString(1)).thenReturn(anyString());
        
         
        // verify(databaseMock).getAllEmployees();
        //when(rs.next()).thenReturn(true);
        when(t.getAllEmployees()).thenReturn("hh");

        //assertEquals(t.getAllEmployees(),arr );
    	
    }
    @Test
    public void query() throws Exception
    {
    	DatabaseOpr d = new DatabaseOpr();
    	Assert.assertEquals("hh",d.getAllEmployees());
    }
}
