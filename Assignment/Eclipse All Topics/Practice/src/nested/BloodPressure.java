package nested;


public class BloodPressure 
{
	class Alert
	{
		public String check(int bloodPressure)
		{
			if(bloodPressure > 140)
				return "Warning!!! High Blood Pressure!!!";
			else
				return "OK";
		}
		
	}
	public static void main(String[] args) 
	{
		
		while(true)
		{
			int bloodPressure = (int)(Math.random()*220)+1;
			
			BloodPressure b = new BloodPressure();
			Alert a= b.new Alert();
			System.out.println(a.check(bloodPressure));
		}
		

	}
}
