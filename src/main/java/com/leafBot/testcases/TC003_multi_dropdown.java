package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.SeleniumHomePage;
import com.leafBot.testng.api.base.Annotations;

public class TC003_multi_dropdown extends Annotations {
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC_003_multi_dropdown";
		testcaseDec = "multi dropdown";
		author = "Venkatesh";
		category = "smoke";
	}
	
	@Test(priority=2)
	public void multi_dropDown()
	{
		new SeleniumHomePage().selectDropDown().multi_select();
	}


}
