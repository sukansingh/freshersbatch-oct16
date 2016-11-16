package filehandling;

import java.io.*;
import java.util.Date;

public class TestSerialization implements Serializable
{
	public static void main(String[] args) throws Exception 
	{
		
		serializationDemo();
		deserializationDemo();
	}
	
	public static void serializationDemo() throws Exception
	{
		Account a = new Account(123,"Jerry",3000.00,new Date());
		
		File file = new File("accountObject.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream out = new ObjectOutputStream(fos);
		
		out.writeObject(a);
		
		System.out.println("Successfully write in accountObject.txt");
	}
	
	public static void deserializationDemo() throws Exception
	{
		File file = new File("accountObject.txt");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream oit = new ObjectInputStream(fis);
		
		System.out.println(oit.readObject());
	}
}
