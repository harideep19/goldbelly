package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 {
	@Test
	void addproduct() {
		System.out.println("product added");
	}
	@AfterTest
	void logout() {
		System.out.println("loged out");
	}

}
