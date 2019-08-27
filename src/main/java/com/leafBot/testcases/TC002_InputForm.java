package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.SeleniumHomePage;
import com.leafBot.testng.api.base.Annotations;

public class TC002_InputForm extends Annotations {
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC_002_inputform";
		testcaseDec = "form input";
		author = "Venkatesh";
		category = "smoke";
		excelFileName="TC001";
	}
	
	@Test(priority=1,dataProvider="fetchData")
	
	public void Input_form(String fName,String lName,String eMail)
	{
		new SeleniumHomePage().select_input_form().enterFirstName(fName).enterLastName(lName).enterEmail(eMail);
	}

}
