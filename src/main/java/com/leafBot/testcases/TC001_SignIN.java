package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.Home_SignIn_Page;
import com.leafBot.testng.api.base.Annotations;

public class TC001_SignIN extends Annotations{
	@BeforeTest
	public void setData() {
		testcaseName = "user login";
		testcaseDec = "login";
		author = "Venkatesh";
		category = "smoke";
		excelFileName="TC001";
	}
	
	@Test(priority=0,dataProvider="fetchData")
	public void sign_in(String email,String password) throws InterruptedException
	{
		new Home_SignIn_Page().login().email(email).password(password);
	}

}
