package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.SeleniumHomePage;
import com.leafBot.testng.api.base.Annotations;

public class TC001_SelectDropDown extends Annotations{
	
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC_001_DropDown";
		testcaseDec = "dropdown";
		author = "Venkatesh";
		category = "smoke";
	}
	
	@Test(priority=0)
	public void dropDown()
	{
		new SeleniumHomePage().selectDropDown().select_dropDown();
	}

}
