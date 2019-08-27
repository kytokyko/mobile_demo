package com.leafBot.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class CheckBoxPage extends Annotations {
	
	public CheckBoxPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH, using="//input[@class='cb1-element']") List<WebElement> all_check_boxes;

	public CheckBoxPage check_box_multiselect() throws InterruptedException
	{
		multiclick(all_check_boxes);
		return this;
	}

}
