package lamdaexpression;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) 
	{
		Random r = new Random();
		Supplier<Integer> sup = () -> r.nextInt(100);
		System.out.println(sup.get());
		
		Consumer<Integer> cus = (Integer i) -> System.out.println("accept value is : "+i);
		cus.accept(10);
	}

}
