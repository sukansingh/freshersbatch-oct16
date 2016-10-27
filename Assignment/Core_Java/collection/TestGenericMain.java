package collection;

import java.util.ArrayList;
import java.util.List;

class TestGeneric<T>
{
	T t;
	public TestGeneric(T t)
	{
		this.t = t;
	}
	public T get()
	{
		return this.t;
	}
}
public class TestGenericMain 
{

	public static void main(String[] args) 
	{
		List <String> ar = new ArrayList<String>();
		
		TestGeneric <String> obj = new TestGeneric <String>("ABC");
		
		System.out.println(obj.get());
	}

}
