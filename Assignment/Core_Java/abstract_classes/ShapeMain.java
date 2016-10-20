abstract class Shape
{
	abstract public void draw();
}

class Line extends Shape
{
	public void draw()
	{
		System.out.println("--------------");
	}
}

class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("--------------");
		System.out.println("|            |");
		System.out.println("|            |");
		System.out.println("--------------");
	}
}

class Cube extends Shape
{
	public void draw()
	{
		System.out.println("------");
		System.out.println("|    |");
		System.out.println("|    |");
		System.out.println("------");
	}
}

public class ShapeMain
{
	public static void main(String arg[])
	{
		Shape s[] = new Shape[3];
		s[0] = new Line();
		s[1] = new Rectangle();
		s[2] = new Cube();
		
		s[0].draw();
		s[1].draw();
		s[2].draw();
	}
}