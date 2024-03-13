package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Groups {
	WebDriver  Driver;
	@Test(priority=1,groups="smoke")
	void launch() {
		Driver = new ChromeDriver();
		
		Driver.get("https://www.demoblaze.com/index.html#");
		Driver.findElement(By.xpath("//a[text()='Phones']")).click();
	}
	@Test(priority=2,groups="regression")
	void rgroup() {
		Driver.findElement(By.xpath("//a[text()='Laptops']")).click();
	}
	@Test(priority=3,groups={"smoke","regression"})
	void srgroup() {
		Driver.findElement(By.xpath("//a[text()='Monitors']")).click();
	}

}
