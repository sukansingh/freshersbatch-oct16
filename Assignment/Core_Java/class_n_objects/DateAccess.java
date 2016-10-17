class Date
{
	private int day,month,year;
	public Date()
	{
		this.day = 17;
		this.month = 10;
		this.year = 2016;
	}
	public Date(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void setFullDate(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String getFullDate()
	{
		return (day+"-"+month+"-"+year);
	}
	public void swapDates(Date obj[])
	{
		Date tmp = obj[0];
		obj[0] = obj[1];
		obj[1] = tmp;
	}
}
public class DateAccess
{
	public static void main(String args[])
	{
		Date d[] = new Date[2];
		for(int i=0;i<d.length;i++)
		{
			d[i] = new Date();
		}
		d[0].setFullDate(17,10,2016);
		d[1].setFullDate(10,12,2016);
		
		d[0].swapDates(d);
		System.out.println(d[0].getFullDate()+"  "+d[1].getFullDate());
	}
	
}