package com.leafBot.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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
	@FindBy(how=How.XPATH, using="//th[@class='prev']") WebElement previous_button;
	
	@FindBy(how=How.CLASS_NAME, using="datepicker-switch") WebElement date_picker_switch;
	
	@FindBy(how=How.XPATH, using="//table[@class='table-condensed']//tbody//td[@class='day']") List<WebElement> days;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='dd/mm/yyyy']") WebElement date;



	
	
	
	
	


	
	
	


	public DatePickerPage select_date() throws InterruptedException
	{
		
		date_webtable(12,days,date);
		
		return this;
		
	}

}
