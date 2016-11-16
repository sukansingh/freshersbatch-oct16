package filehandling;
import java.io.*;
import java.util.Enumeration;
import java.util.Vector;
public class TestSequence 
{

	public static void main(String[] args) throws Exception 
	{
		File file1 = new File("abc.txt");
		FileInputStream fis1 = new FileInputStream(file1);
		
		File file2 = new File("xyz.txt");
		FileInputStream fis2 = new FileInputStream(file2);
		
		File file3 = new File("account.txt");
		FileInputStream fis3 = new FileInputStream(file3);
		
		Vector<InputStream> v = new Vector<InputStream>();
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		Enumeration e = v.elements();
		SequenceInputStream sis = new SequenceInputStream(e);
		
		int i=0;
		while((i=sis.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}
