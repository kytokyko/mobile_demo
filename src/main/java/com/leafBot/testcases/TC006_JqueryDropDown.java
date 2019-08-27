package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.SeleniumHomePage;
import com.leafBot.testng.api.base.Annotations;

public class TC006_JqueryDropDown extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC_001_DropDown";
		testcaseDec = "dropdown";
		author = "Venkatesh";
		category = "smoke";
	}
	
	@Test(priority=5)
	public void query_dropdown()
	{
		new SeleniumHomePage().jqueryDropdown().select_country();
	}

}
