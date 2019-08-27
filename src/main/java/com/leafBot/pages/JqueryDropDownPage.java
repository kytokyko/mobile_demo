package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class JqueryDropDownPage extends Annotations{
	
	public JqueryDropDownPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="(//span[@role='combobox'])[1]") WebElement select_country;
	
	@FindBy(how=How.XPATH, using="(//input[@type='search'])[2]") WebElement country_input;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Select state(s)']") WebElement select_state;


	
	
	
	
	public JqueryDropDownPage select_country()
	{
		click(select_country);
		type(country_input, "India");
		type(select_state, "arizona");

		return this;
	}

	
	

}
