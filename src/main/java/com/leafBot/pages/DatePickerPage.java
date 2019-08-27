package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class DatePickerPage extends Annotations {
	
	public DatePickerPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH, using="//i[@class='glyphicon glyphicon-th']") WebElement calender;

	public DatePickerPage select_date()
	{
		click(calender);
		return this;
	}

}
