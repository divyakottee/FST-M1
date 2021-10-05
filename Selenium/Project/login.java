package crmtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;


public class login extends openurl{
	
	@BeforeTest
	public void loginCrm(){
		
		try{
			Thread.sleep(5000);
			}catch(Exception e){
				
			}
		
		WebElement username = driver.findElement(By.id("user_name"));
		WebElement password = driver.findElement(By.id("username_password"));
		WebElement login = driver.findElement(By.id("bigbutton"));
		
	
		username.sendKeys("admin");
		password.sendKeys("pa$$w0rd");
		
		login.submit();
		
		try{
			Thread.sleep(5000);
			}catch(Exception e){
				
			}
		
		WebElement homepageverify = driver.findElement(By.xpath("//button[@title = 'admin']/span[2]"));
		
		String admintext = homepageverify.getText();
		
		Assert.assertEquals(admintext, "admin", "Reached homepage successfully");
		
		System.out.println("Activity 4 pass");

}

}