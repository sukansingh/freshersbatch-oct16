class BannerStringBuilder
{
	public static void main(String arg[])throws Exception
	{
		StringBuffer s=new StringBuffer("welcome to java");
		while(true)
		{
			char c = s.charAt(0);
			
			s = s.delete(0,1);
			s = s.append(c+"");
			
			System.out.print("\r"+s);
			Thread.sleep(1000);
		}
	}
} 