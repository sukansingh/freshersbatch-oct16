package fact;

public class Faculty
{
	private int roll_no;
	private int marks;
	
	public Faculty(int roll_no,int marks)
	{
		this.roll_no = roll_no;
		this.marks = marks;
	}
	public int getStudentMarks(int roll_no)
	{
		if(this.roll_no==roll_no)
			return this.marks;
		else
			return 0;
	}
}