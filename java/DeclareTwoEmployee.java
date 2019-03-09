
public class DeclareTwoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee clerk = new Employee();
		Employee driver = new Employee();
		clerk.setEmpNum(345);
		driver.setEmpNum(567);
		
		System.out.println("The clerk's number is " + clerk.getEmpNum() + " and the driver's number is " + driver.getEmpNum() + ".");

	}

}
