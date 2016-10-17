class StackedArray
{
	private int top;
	private int array[] = new int[10];
	public StackedArray()
	{
		top = 0;
	}
	public void push(int v)
	{
		array[top] = v;
		top++;
	}
	public void pop()
	{
		if(top<=0)
			System.out.println("Underflow");
		else
		top--;
	}
	public void show()
	{
		for(int i=top-1;i>=0;i--)
		{
			System.out.println(array[i]+" ");
		}
	}
	
}
class StackImp
{
	public static void main(String arg[])
	{
		StackedArray s = new StackedArray();
		s.push(10); s.push(40); s.push(20); s.push(30);
		s.show();
		s.pop();
		s.show();
	}
}