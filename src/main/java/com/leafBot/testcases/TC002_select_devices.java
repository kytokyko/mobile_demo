package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.Home_SignIn_Page;
import com.leafBot.testng.api.base.Annotations;

public class TC002_select_devices extends Annotations{
	@BeforeTest
	public void setData() {
		testcaseName = "user login";
		testcaseDec = "login";
		author = "Venkatesh";
		category = "smoke";
		excelFileName="TC001";
	}
	
	@Test(priority=1)
	public void select_devices()
	{
		new Home_SignIn_Page().select_drop_down();
	}

}
