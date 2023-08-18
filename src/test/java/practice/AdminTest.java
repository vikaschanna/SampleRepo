package practice;

import org.testng.annotations.Test;

public class AdminTest {
	@Test(groups = "regression")
	public void createAdmin() {
		System.out.println("Admin created");
	}
	
	@Test(groups = "smoke")
	public void runAdmin() {
		System.out.println("run successful as Admin");
		System.out.println("done");
		System.out.println(10/0);
	}
	@Test(groups = "regression")
	public void deleteAdmin() {
		System.out.println("Admin deleted");
	}
	
}
