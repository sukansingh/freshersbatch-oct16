package collection;

import java.util.ArrayList;
import java.util.List;

class PrintNumberGeneric
{
	
	public static void printList(List<? extends Number> list) 
	{
		for (Object elem: list)
			System.out.println(elem + " ");
	}
}
public class PrintNumberGenericMain 
{

	public static void main(String[] args) 
	{
		//List <String> ar = new ArrayList<String>();
		List <Integer> ar = new ArrayList<Integer>();
		ar.add(5);
		ar.add(10);
		ar.add(15);
		ar.add(20);
		//TestGeneric <Integer> obj = new TestGeneric <Integer>();
		PrintNumberGeneric obj = new PrintNumberGeneric();
		
		PrintNumberGeneric.printList(ar);
	}

}
