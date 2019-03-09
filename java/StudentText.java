
public class StudentText {

	public static void main(String[] args) 
	{
		createStudent1();		
	}
	
	// Calls Constructor 1
	public static void createStudent1()
	{
		Student myStudent = new Student(111, 3.0);
		
		System.out.println("Student 1 number is " + myStudent.getStuNum() + ".");
		System.out.println("Student GPA is " + myStudent.getGpa() + ".");			
	}
	
	// Calls Constructor 2
	public static void createStudent2()
	{
		Student myStudent = new Student(3.25);
		
		System.out.println("Student 2 number is " + myStudent.getStuNum() + ".");
		System.out.println("Student GPA is " + myStudent.getGpa() + ".");			
	}

}
