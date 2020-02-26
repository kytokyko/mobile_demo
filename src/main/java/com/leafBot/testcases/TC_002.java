package com.leafBot.testcases;

import org.testng.annotations.Test;

import com.leafBot.pages.AppHomePage;
import com.leafBot.testng.api.base.Annotations;

public class TC_002 extends Annotations{
	
	@Test
	public void navigate_to_elements() throws InterruptedException
	{
		 new AppHomePage().icons_click();
	}

}
