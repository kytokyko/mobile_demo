package com.leafBot.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class RadioButtonPage extends Annotations {
	
	public RadioButtonPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.NAME, using="optradio") List<WebElement> single_button;
	@FindBy(how=How.NAME, using="gender") List<WebElement> multiButton_gender;
	@FindBy(how=How.NAME, using="ageGroup") List<WebElement> multiButton_agegroup;



	
	public RadioButtonPage singleButton() throws InterruptedException
	{
		multiclick(single_button);
		return this;
	}
	
	public RadioButtonPage multiradioButton() throws InterruptedException
	{
		multiclick(multiButton_gender);
		multiclick(multiButton_agegroup);
		return this;

	}

}
