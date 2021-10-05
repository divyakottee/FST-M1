package crmtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;


public class openurl {

		public static WebDriver driver = new FirefoxDriver();
		public static WebDriverWait wait = new WebDriverWait(driver, 10);
		public static Actions builder = new Actions(driver);
		
		@BeforeSuite
		public void url(){

		driver.get("https://alchemy.hguy.co/crm/");

		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}

		String titleofpage = driver.getTitle();

		System.out.println("The title of the page is " + titleofpage);
		Assert.assertEquals(titleofpage, "SuiteCRM", "Assert pass");

		WebElement imageSuiteCRM = driver.findElement(By.tagName("img"));
		String imageurl = imageSuiteCRM.getAttribute("src");

		System.out.println("The URL of the image Suite CRM is " + imageurl);

		WebElement copyright = driver.findElement(By.xpath("//a[contains(@id, 'options')]"));
		String copyrighttext = copyright.getText();

		System.out.println("The copyright text is " + copyrighttext);
		
		System.out.println("Activities 1 2 and 3 pass");

	}

}