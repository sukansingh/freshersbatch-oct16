package filehandling;

import java.io.*;
public class ReadWrite {

	public static void main(String[] args) throws Exception 
	{
		File file1 = new File("abc.txt");
		FileInputStream fis = new FileInputStream(file1);
		
		File file2 = new File("xyz.txt");
		FileOutputStream fos = new FileOutputStream(file2);
		
		int i=0;
		//StringBuilder sb = new StringBuilder();
		do
		{
			i = fis.read();
			if(i!=-1)
				fos.write((char)i);
		}while(i!=-1);
		
		System.out.println("Successfully read abc & write into xyz");

	}
	/*
	public static void writeFile() throws Exception
	{
		File file = new File("xyz.txt");
		FileOutputStream fos = new FileOutputStream(file);
		
		
		System.out.println(sb);
	}
	*/
	/*
	public static void readFile() throws Exception
	{
		File file = new File("abc.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int i=0;
		StringBuilder sb = new StringBuilder();
		do
		{
			i = fis.read();
			if(i!=-1)
				sb.append((char)i);
		}while(i!=-1);
		
		System.out.println(sb);
	}
	*/
}
