package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.Home_SignIn_Page;
import com.leafBot.testng.api.base.Annotations;

public class TC003_hovering extends Annotations{
	@BeforeTest
	public void setData() {
		testcaseName = "user login";
		testcaseDec = "login";
		author = "Venkatesh";
		category = "smoke";
		excelFileName="TC001";
	}
	@Test(priority=2)
	public void hover() throws InterruptedException
	{
		new Home_SignIn_Page().multi_hover();
	}
	

}
