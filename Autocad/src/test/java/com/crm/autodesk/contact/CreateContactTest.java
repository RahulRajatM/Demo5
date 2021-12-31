package com.crm.autodesk.contact;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateContactTest {

	@Test(groups="Smoke")
	public void createContactTest()
	{
		Reporter.log("Contact created",true);
		String url=System.getProperty("url");
		String browser=System.getProperty("browser");
	}
}
