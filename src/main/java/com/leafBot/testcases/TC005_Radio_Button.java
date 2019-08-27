package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.SeleniumHomePage;
import com.leafBot.testng.api.base.Annotations;

public class TC005_Radio_Button extends Annotations{
	@BeforeTest
	public void setData() {
		testcaseName = "TC_005_radio button";
		testcaseDec = "radio button";
		author = "Venkatesh";
		category = "smoke";
	}
	
	@Test(priority=4)
	public void radioButton() throws InterruptedException
	{
		new SeleniumHomePage().radioButton().singleButton().multiradioButton();
	}

}
