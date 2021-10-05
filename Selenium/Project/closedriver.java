package crmtests;

import org.testng.annotations.AfterSuite;

public class closedriver extends openurl {
	
	@AfterSuite
	public void closebrowser()
	{
		driver.close();
	}

}
