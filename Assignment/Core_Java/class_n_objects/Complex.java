class ComplexCal
{
	private int real,img;
	public ComplexCal(int real,int img)
	{
		this.real = real;
		this.img = img;
	}
	public void setNumber(int real,int img)
	{
		this.real = real;
		this.img = img;
	}
	public String show()
	{
		return (real+" i , "+img);
	}
	//ADD
	public String add(ComplexCal obj[])
	{
		int sumReal=0, sumImg=0;
		for(int i=0;i<obj.length;i++)
		{
			sumReal += obj[i].real;
			sumImg += obj[i].img;
		}
		return (sumReal+" i , "+sumImg);
	}
	//SUB
	public String sub(ComplexCal obj1,ComplexCal obj2)
	{
		int subReal,subImg;
		subReal = obj1.real-obj2.real;
		subImg = obj1.img-obj2.img;
		
		return (subReal+" i , "+subImg);
	}
	public String mul(ComplexCal obj1,ComplexCal obj2)
	{
		int mulReal,mulImg;
		mulReal = obj1.real*obj2.real;
		mulImg = obj1.img*obj2.img;
		
		return (mulReal+" i , "+mulImg);
	}
	public void swap(ComplexCal cc[])
	{
		ComplexCal tmp = cc[0];
		cc[0] = cc[1];
		cc[1] = tmp;
	}
}
public class Complex
{
	public static void main(String arg[])
	{
		ComplexCal cc[] = new ComplexCal[3];
		cc[0] = new ComplexCal(10,10);
		cc[1] = new ComplexCal(20,50);
		cc[2] = new ComplexCal(30,60);
		for(int i=0;i<cc.length;i++)
		{
			System.out.println(cc[i].show());
		}
		String add = cc[0].add(cc);
		System.out.println("Add : "+add);
		
		String sub = cc[0].sub(cc[0],cc[1]);
		System.out.println("Sub : "+sub);
		
		String mul = cc[0].mul(cc[0],cc[1]);
		System.out.println("Mul : "+mul);
		
		cc[0].swap(cc);
		System.out.println("After Swap : "+cc[0].show()+" || "+cc[1].show());
	}
}