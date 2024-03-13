package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations1 {
	
	
	WebDriver Driver;
	
	@BeforeMethod
	void openap() {
		
		
Driver = new ChromeDriver();
		
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Driver.manage().window().maximize();
	}
		
		@Test(priority=1)
		void login() {
			
		
		Driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
	
	
	
	@Test(priority=2)
	void logout(){
		Select drpdn = new Select(Driver.findElement(By.className("oxd-userdropdown-tab")));
		drpdn.selectByIndex(3);
	}
	
	@AfterMethod
	void quit() {
		Driver.close();
	}
}

