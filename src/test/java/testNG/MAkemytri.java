package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MAkemytri {
	
	WebDriver Driver;
	@Test(priority=1)
	void one() throws InterruptedException {
		Driver =new ChromeDriver();
		Driver.get("https://www.makemytrip.com/");
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	@Test(priority=2)
void from() {
	Driver.findElement(By.xpath("//span[text()='Departure']")).click();
	
}
}
