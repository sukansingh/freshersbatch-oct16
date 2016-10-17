class QueuedArray
{
	private int f,r;
	private int array[] = new int[10];
	public QueuedArray()
	{
		f = 0;
		r=0;
	}
	public void push(int v)
	{
		array[r] = v;
		r++;
	}
	public void pop()
	{
		if(f>=r)
			System.out.println("Underflow");
		else
			f++;
	}
	public void show()
	{
		for(int i=f;i<r;i++)
		{
			System.out.println(array[i]+" ");
		}
	}
	
}
class QueueImp
{
	public static void main(String arg[])
	{
		QueuedArray q = new QueuedArray();
		q.push(10); q.push(20); q.push(30); q.push(40);
		q.show();
		q.pop();
		q.show();
	}
}