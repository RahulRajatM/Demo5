package com.crm.autodesk.contact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateContactTest {

	@Test(groups="Smoke")
	public void createContactTest()
	{
		Reporter.log("Contact created",true);
		String url=System.getProperty("url");
		String browser=System.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriver driver=new ChromeDriver();
			driver.get(url);
		}
	}
}
