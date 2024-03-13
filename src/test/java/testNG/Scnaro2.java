package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scnaro2 {
	@BeforeTest
	void login() {
		System.out.println("login");
		
	}
	
@Test(priority=1)
	void search() {
		System.out.println("searched");
	}
@Test(priority=2)
	void addproduct() {
		System.out.println("product added");
	}
@AfterTest
	void logout() {
		System.out.println("logout");
	}
}

//@BeforeMethod
//void login() {
//	System.out.println("login");
//	
//}
//@AfterMethod
//void logout() {
//	System.out.println("logout");
//}
//
//@Test(priority=1)
//void search() {
//	System.out.println("searched");
//}
//@Test(priority=2)
//void addproduct() {
//	System.out.println("product added");
//}
//
//}
