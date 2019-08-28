package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.SeleniumHomePage;
import com.leafBot.testng.api.base.Annotations;

public class TC007_BootstrapDatePicker extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC_007_date picker";
		testcaseDec = "date picker";
		author = "Venkatesh";
		category = "smoke";
	}
	
	@Test(priority=6)
	public void calender() throws InterruptedException
	{
		new SeleniumHomePage().datePicker().select_date();
	}

}
