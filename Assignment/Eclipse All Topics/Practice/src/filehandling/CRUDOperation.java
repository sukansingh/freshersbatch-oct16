package filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;
/*
class AccountCRUD
{
	private int account_no;
	private double bal;
	private String name;
	
	public AccountCRUD(int account_no, String name, double bal)
	{
		this.account_no = account_no;
		this.bal = bal;
		this.name = name;
		//this.dob = dob;
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
	
	@Override
	public String toString()
	{
		return (account_no+" - "+name+" - "+bal);
	}
}
*/
public class CRUDOperation 
{

	public static void main(String[] args) throws Exception 
	{
		Account a[] = new Account[2];
		 a[0] = new Account(12,"John",4000,new Date());
		 a[1] = new Account(22,"Tom",50000,new Date());
		 
		 File file = new File("account.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		//create(a,raf);
		
		readFile(raf,a.length);
	}
	public static void create(Account aa[],RandomAccessFile raf) throws Exception
	{
		
		for(Account a : aa)
		{
			raf.writeInt(a.getAccount_No());
			raf.writeUTF(a.getName());
			raf.writeDouble(a.getBal());
			raf.writeUTF(a.getDob());
			System.out.println("Successfully write in account.txt");
		}
	}
	public static void update(Account aa,RandomAccessFile raf) throws Exception
	{
		
		for(Account a : aa)
		{
			raf.writeInt(a.getAccount_No());
			raf.writeUTF(a.getName());
			raf.writeDouble(a.getBal());
			raf.writeUTF(a.getDob());
			System.out.println("Successfully write in account.txt");
		}
	}
	
	public static void readFile(RandomAccessFile raf,int len) throws Exception
	{
		for(int i=0;i<len;i++)
			System.out.println(raf.readInt()+" - "+raf.readUTF()+" - "+raf.readDouble()+" - "+raf.readUTF());
		
	}
}
