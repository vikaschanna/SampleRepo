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
		
	}
	@Test(groups = "regression")
	public void deleteAdmin() {
		System.out.println("Admin deleted");
		System.out.println("Admin not deleted");
		
	}
	
	
}
