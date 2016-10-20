class Banner
{
	public static void main(String arg[])throws Exception
	{
		StringBuffer s=new StringBuffer("welcome to java");
		while(true)
		{
			char c = s.charAt(0);
			
			//String t = s.substring(1);
			s = s.delete(0,1);
			s = s.append(c+"");
			
			System.out.print("\r"+s);
			Thread.sleep(1000);
		}
	}
} 