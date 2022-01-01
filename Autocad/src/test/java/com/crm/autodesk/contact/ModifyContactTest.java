
package com.crm.autodesk.contact;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ModifyContactTest {

	@Test(groups="Regression")
	public void modifyContactTest()
	{
		Reporter.log("Contact modifies", true);
	}

	@Test
	public void deleteContact()
	{
		Reporter.log("Contact Deleted",true);
	}
}
