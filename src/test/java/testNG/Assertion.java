package testNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	int a=10;
	int b=20;
	@Test
	void validate() {
		Assert.assertEquals(a, b);
		System.out.println("valid");
	}

}
