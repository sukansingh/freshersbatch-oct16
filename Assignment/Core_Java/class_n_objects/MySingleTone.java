class MySingleTon
{
	private static MySingleTone mst;
	private MySingleTon()
	{
		
	}
	public static MySingleTon getInstance()
	{
        if(mst == null)
		{
            mst = new MySingleTon();
        }
        return myObj;
    }
    
}
class MySingleTonDemo extends MySingleTon
{
	public static void main(String arg[])
	{
		
	}
}