package com.crm.autodesk.product;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateProductTest {

	@Test(groups="Smoke")
	public void createProductTest()
	{
		Reporter.log("product created",true);
	}
}

