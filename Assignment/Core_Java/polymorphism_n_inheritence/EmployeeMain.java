class Employee
{
	private int empno;
	private String name;
	private int salary;
	
	public Employee(int empno,String name,int salary)
	{
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	public int getSalary()
	{
		return salary;
	}
	public String toString()
	{
		return (empno+" - "+name+" - "+salary);
	}
}

class Manager extends Employee
{
	private int incentive;
	
	public Manager(int empno,String name,int salary,int incentive)
	{
		super(empno,name,salary);
		this.incentive = incentive;
	}
	public int getSalary()
	{
		return (super.getSalary())+incentive;
	}
}

class Labour extends Employee
{
	private int overtime;
	
	public Labour(int empno,String name,int salary,int overtime)
	{
		super(empno,name,salary);
		this.overtime = overtime;
	}
	public int getSalary()
	{
		return (super.getSalary())+overtime;
	}
}

class EmployeeMain
{
	public static void main(String arg[])
	{
		Employee e[] = new Employee[2];
		e[0] = new Manager(1,"Ram",25000,1000);
		e[1] = new Labour(2,"Shyam",30000,2000);
		
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}
		System.out.println("Total Salary of All Employee is : "+getTotalSalary(e));
	}
	public static int getTotalSalary(Employee t[])
	{
		int total=0;
		for(int i=0;i<t.length;i++)
		{
			total += t[i].getSalary();
		}
		return total;
	}
}