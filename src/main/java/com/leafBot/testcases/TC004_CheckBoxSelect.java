package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.SeleniumHomePage;
import com.leafBot.testng.api.base.Annotations;

public class TC004_CheckBoxSelect extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC_004_checkBox";
		testcaseDec = "checkbox";
		author = "Venkatesh";
		category = "smoke";
	}
	
	@Test(priority=3)
	public void checkbox() throws InterruptedException
	{
		new SeleniumHomePage().check_box().check_box_multiselect();
	}

}
