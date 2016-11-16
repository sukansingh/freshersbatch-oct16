package filehandling;

import java.io.*;
import java.util.Date;
class Account implements Serializable 
{
	private int account_no;
	private double bal;
	private String name;
	private Date dob;
	
	private final static long serialVersionUID = 7L;
	
	public Account(int account_no, String name, double bal, Date dob)
	{
		this.account_no = account_no;
		this.bal = bal;
		this.name = name;
		this.dob = dob;
	}
	public int getAccount_No()
	{
		return this.account_no;
	}
	public double getBal()
	{
		return this.bal;
	}
	public String getName()
	{
		return this.name;
	}
	public String getDob()
	{
		return ""+this.dob;
	}
	@Override
	public String toString()
	{
		return (account_no+" - "+name+" - "+bal+" - "+dob);
	}
}
public class AccountMain
{
	public static void main(String args[]) throws Exception
	{
		writeFile();
		readFile();
	}
	public static void writeFile() throws Exception
	{
		File file = new File("account.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		Account a = new Account(123,"Tom",2000.00,new Date());
		dos.writeInt(a.getAccount_No());
		dos.writeUTF(a.getName());
		dos.writeDouble(a.getBal());
		System.out.println("Successfully write in account.txt");
	}
	
	public static void readFile() throws Exception
	{
		File file = new File("account.txt");
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		
		int i=0;
		StringBuilder sb = new StringBuilder();
		System.out.println(dis.readInt()+" - "+dis.readUTF()+" - "+dis.readDouble());
		
	}
	
}


