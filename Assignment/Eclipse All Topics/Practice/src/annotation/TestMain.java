package annotation;
import java.lang.annotation.*;
import java.lang.reflect.*;
class Test
{
	private String name;
	private int age;
	
	public Test()
	{
		this.name = name;
		this.age = age;
	}
	
	@Getter
	public String getName()
	{
		return this.name;
	}
	
	@Getter
	public int getAge()
	{
		return this.age;
	}
	
	@Getter
	public String getDob()
	{
		return "10-10-2010";
	}
}

public class TestMain
{
	public static void main(String args[]) throws Exception
	{
		Class c = Class.forName("annotation.Test");
		Object obj = c.newInstance();
		
		Field f[] = c.getDeclaredFields();
		String fieldName[] = new String[f.length];
		for(int i=0;i<f.length;i++)
		{
			fieldName[i] = f[i].getName();
		}
		
		Method m[] = c.getDeclaredMethods();
		for(Method mm : m)
		{
			Annotation an[] = mm.getAnnotations();
			for(Annotation a : an)
			{
				if(a instanceof Getter)
				{
					String fname = mm.getName();
					String fsub = fname.substring(3);
					boolean flag=false;
					for(int i=0;i<fieldName.length;i++)
					{
						if(fsub.equalsIgnoreCase(fieldName[i]))
						{
							flag=true;
							System.out.println(fname+" Valid");
						}
							
					}
					if(flag==false)
						System.out.println(fname+" InValid");
				}
			}
		}
	}
}