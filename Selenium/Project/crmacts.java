package crmtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class crmacts extends openurl {
	
			@Test (priority = 0)
			public void toolbar(){
				
				try{
					Thread.sleep(5000);
					}catch(Exception e){
						
					}
				
				WebElement toolbar = driver.findElement(By.xpath("//div[@id = 'toolbar']"));
				String toolbarcolor = toolbar.getCssValue("color");
				
				System.out.println("The color of toolbar is " + toolbarcolor);
				
				System.out.println("Activity 5 pass");
				
			}
			

			@Test(priority = 1)
			public void activitiesopt(){
				
				try{
					Thread.sleep(5000);
					}catch(Exception e){
						
					}
				
				WebElement activities = driver.findElement(By.xpath("//div[@id = 'toolbar']/ul/li[5]/span/a"));
				
				String optText = activities.getText();
				
				Assert.assertEquals(optText, "ACTIVITIES", "Option ACTIVITIES is present as expected");
				
				System.out.println("Activity 6 pass");
			}
			
			@Test (priority = 2)
			public void sales() {
				
				
				try{
					Thread.sleep(5000);
					}catch(Exception e){
						
					}
				
				WebElement sales = driver.findElement(By.xpath("//div[@id = 'toolbar']/ul/li[2]/span/a"));
						
				String salesText = sales.getText();
				
				Assert.assertEquals(salesText, "SALES", "Logged in successfully");
				
				builder.moveToElement(sales).perform();
				
				WebElement leadundersales = driver.findElement(By.xpath("//a[contains(@id, 'Leads')]"));
				
				builder.moveToElement(leadundersales).click().perform();
				
				try{
					Thread.sleep(5000);
					}catch(Exception e){
						
					}
				
				WebElement addinfo = driver.findElement(By.xpath("//tbody/tr/td[10]"));
				
				addinfo.click();
				
				WebElement phoneno = driver.findElement(By.className("phone"));
				
				String contactoflead = phoneno.getText();
				
				System.out.println("The contact of the lead from row 1 is " + contactoflead);
				
				for(int j=1; j<=10; j++){
					WebElement name = driver.findElement(By.xpath("//tbody/tr["+j+"]/td[3]"));
					WebElement user = driver.findElement(By.xpath("//tbody/tr["+j+"]/td[8]"));
					
					System.out.println("The name of "+ j+ "th lead is " + name.getText() + "and The user access of the lead is " + user.getText());
				}
				
				System.out.println("Activities 7 and 9 are pass");
			}


			@Test(priority = 3)
			public void tableone(){
				
				try{
					Thread.sleep(5000);
					}catch(Exception e){
						
					}
					
				WebElement sales = driver.findElement(By.xpath("//div[@id = 'toolbar']/ul/li[3]/span/a"));
				
				builder.moveToElement(sales).perform();
				
				WebElement accounts = driver.findElement(By.xpath("//a[contains(@id,'Accounts')]"));
				
				builder.moveToElement(accounts).click().perform();
				
				try{
					Thread.sleep(5000);
					}catch(Exception e){
						
					}
				
				for(int i = 1; i<=10; i++)
				{
					int a = i%2;
					
					if(a!=0){
						
						WebElement nameofacct = driver.findElement(By.xpath("//tbody/tr["+ i + "]/td[3]/b/a"));
						String acctname = nameofacct.getText();
						System.out.println("The "+i+"th account name is " + acctname);
						
							}
					
					
				}
						
				System.out.println("Activity 8 pass");
							
			}
			
			
			
			
		}

			




