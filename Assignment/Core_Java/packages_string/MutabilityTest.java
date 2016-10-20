public class MutabilityTest
{
	public static void main(String arg[])
	{
		String s1 = "hello";
		int tmp = s1.hashCode();
		System.out.println("s1 Hashcode : "+s1.hashCode());
		
		//String s2 = "hello";
		//System.out.println("s2 Hashcode : "+s2.hashCode());
		
		s1 = s1+" world";
		if(s1.hashCode()!=tmp)
		{
			System.out.println("hashCode is Diff So String is immutable");
			System.out.println("s1 Hashcode : "+s1.hashCode());
		}
		//----------------------
		System.out.println("--------------");
		StringBuffer sb1 = new StringBuffer("hello");
		int sb1tmp = sb1.hashCode();
		System.out.println("sb1 Hashcode : "+sb1.hashCode());
		
		sb1 = sb1.append(" world");
		//System.out.println("sb1 new Hashcode : "+sb1.hashCode());
		if(sb1.hashCode()==sb1tmp)
		{
			System.out.println("hashCode is Same So StringBuffer is Mutable");
			System.out.println("sb1 Hashcode : "+sb1.hashCode());
		}
	}
}