package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hariharan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Selvam");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dinga");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Dingi");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("AutomationTesting");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium is Simple");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Dinga001@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle(); 
		System.out.println(title);
		driver.findElement(By.partialLinkText("Duplicate")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("hareeharan");
		driver.findElement(By.name("submitButton")).click();
		 title = driver.getTitle();
		 System.out.println(title);
		 

	}

}
