package com.leafBot.pages;

import java.util.List;

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
	@FindBy(how=How.XPATH, using="//table[@class='table-condensed']//td") List<WebElement> web_data_table;


	public DatePickerPage select_date()
	{
		click(calender);
		int size = web_data_table.size();
		
		for(int i=0;i<size;i++)
		{
			System.out.println(web_data_table.get(i).getText());
			
		}
		return this;
	}

}
