package practice;

import org.testng.annotations.Test;

public class CustomerTest {
	@Test (groups = "smoke")
	public void createCustomer() {
		System.out.println("Customer created");
	}
	
	@Test (groups = "regression")
	public void runCustomer() {
		System.out.println("run successful as Customer");
	}
}
