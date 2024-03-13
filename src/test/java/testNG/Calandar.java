package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calandar {
	
	WebDriver Driver;
	@Test
	void open() {
		Driver = new ChromeDriver();
		
		Driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		Driver.manage().window().maximize();
		
		Driver.findElement(By.id("second_date_picker")).click(); 
		
		String monthyear = Driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthyear);
		
		String month =monthyear.split(" ")[0].trim();
		String year =monthyear.split(" ")[1].trim();
		
		while(!(month.equals("June")&& year.equals("2023"))) {
			//Driver.findElement(By.xpath("//span[text()='Next']")).click();
			Driver.findElement(By.xpath("//span[text()='Prev']")).click();
			monthyear = Driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(monthyear);
			
			 month =monthyear.split(" ")[0].trim();
			 year =monthyear.split(" ")[1].trim();
			
			
		}
		Driver.findElement(By.xpath("//a[text()='17']")).click();
		 
	}
}
	
	
