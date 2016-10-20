package stud;
import fact.Faculty;

public class Student
{
	public static void main(String arg[])
	{
		Faculty f = new Faculty(1,100);
		int marks = f.getStudentMarks(1);
		System.out.println(marks);
	}
}