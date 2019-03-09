
public class Student 
{
	private int stuNum;
	private double gpa;
	
	Student (int num, double avg) // Constructor 1
	{
		stuNum = num;
		gpa = avg;
	}
	
	Student(double avg) // Constructor 2: Takes a double for student number
	{
		this(999, avg);
	}
	
	Student(int num) // Constructor 3: Takes an int for student number
	{
		this(num, 0.0);
	}
	
	Student () // Constructor 4: Default no arg constructor
	{
		this(999, 0.0);
	}

	public int getStuNum() 
	{
		return stuNum;
	}

	public void setStuNum(int stuNum) 
	{
		this.stuNum = stuNum;
	}

	public double getGpa() 
	{
		return gpa;
	}
	
	public void setGpa()
	{
		this.gpa = gpa;
	}
}
