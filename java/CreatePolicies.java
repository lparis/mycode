
public class CreatePolicies {

	public static void main(String[] args) {
		
		// Calls default no arg constructor
		CarInsurancePolicy noArgPolicy = new CarInsurancePolicy();
		
		CarInsurancePolicy firstPolicy = new CarInsurancePolicy(123);
		
		CarInsurancePolicy secondPolicy = new CarInsurancePolicy(456, 4);

		CarInsurancePolicy thirdPolicy = new CarInsurancePolicy(789, 12, "Newcastle");
		
		firstPolicy.display();
		secondPolicy.display();
		thirdPolicy.display();

	}

}
