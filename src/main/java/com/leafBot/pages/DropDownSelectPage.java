package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class DropDownSelectPage extends Annotations{
	
	public DropDownSelectPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.ID, using="select-demo") WebElement drop_down_element;

	public DropDownSelectPage select_dropDown()
	{
		 selectDropDownUsingText(drop_down_element,"Friday");
		 verifyExactAttribute(drop_down_element,"value","Friday");
		 return this;
	}
	
	@FindBy(how=How.XPATH, using="//option[text()='California']") WebElement california_text;
	@FindBy(how=How.XPATH, using="//option[text()='Florida']") WebElement Florida_text;
	@FindBy(how=How.XPATH, using="//option[text()='New Jersey']") WebElement NewJersey_text;
	@FindBy(how=How.XPATH, using="//option[text()='New York']") WebElement NewYork_text;
	
	@FindBy(how=How.XPATH, using="//button[text()='Get All Selected']") WebElement getAllSelected;



	
	public DropDownSelectPage multi_select()
	{
		multiSelect(california_text,Florida_text,NewJersey_text);
		click(getAllSelected);
		return this;
	}


	
	

}
