package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	WebDriver Driver;
	@BeforeMethod
	void lanch() {
		Driver = new ChromeDriver();
		
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(dataProvider="TD")
	void login(String uname,String pwd  ) throws InterruptedException {
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		Driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		Driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	@AfterMethod
	void quit() {
		Driver.quit();
	}
	@DataProvider(name="TD")
	String [][] logindata(){
		String data [][]={
				{"Admin","admin123"}
		};
		
		return data;
		
		
	}

}
