public class CreateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee receptionist = new Employee();
		Employee deliveryPerson = new Employee();

		receptionist.setEmpNum(10);
		receptionist.setEmpSal(100000);

		deliveryPerson.setEmpNum(11);
		deliveryPerson.setEmpSal(120000);

		System.out.println(receptionist.getEmpNum());

	}

}
