package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assetion1 {
	WebDriver  Driver;
	@BeforeMethod
	void get() {
		Driver = new ChromeDriver();
		
		Driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Driver.manage().window().maximize();
		
	}
	@Test
	void login() throws InterruptedException {
		WebElement email =Driver.findElement(By.xpath("//input[@id='Email']"));

		email.clear();
		email.sendKeys("admin@yourstore.com");
		WebElement pass= Driver.findElement(By.xpath("//input[@class='password']"));

		pass.clear();
		pass.sendKeys("admin");
		Driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		String expects="Dashboard";
		String actres=Driver.findElement(By.xpath("//div[@class='content-header']/h1")).getText();

		System.out.println(actres);
		
		SoftAssert sa = new SoftAssert ();
		sa.assertEquals(expects,actres);
		sa.assertAll();
		
		
	}
	@AfterMethod
	void logout() throws InterruptedException {
		Thread.sleep(5000);
		Driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

}
