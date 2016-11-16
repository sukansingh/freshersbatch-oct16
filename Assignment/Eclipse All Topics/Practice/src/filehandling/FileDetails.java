package filehandling;

import java.io.*;
import java.util.Date;
public class FileDetails {

	public static void main(String[] args) throws Exception 
	{
		File file1 = new File("C:\\Users\\singh_sk\\workspace\\Practice");
		//FileInputStream fis = new FileInputStream(file1);
		File f[] = file1.listFiles();
		for(File ff : f)
		{
			System.out.println("Name : "+ff.getName());
			System.out.println("Size : "+ff.getTotalSpace());
			System.out.println("Last Mofdifeid  : "+new Date(ff.lastModified()));
			System.out.println("Read Permissions : "+ff.canRead());
			System.out.println("Write Permissions : "+ff.canWrite());
			System.out.println("Execute Permissions : "+ff.canExecute());
			System.out.println("Parent : "+ff.getParentFile());
		}
		
		//System.out.println(file1.getAbsoluteFile());
	}

}
