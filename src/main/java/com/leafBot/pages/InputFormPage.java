package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class InputFormPage extends Annotations {
	
	public InputFormPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.NAME, using="first_name") WebElement FirstName;
	@FindBy(how=How.NAME, using="last_name") WebElement LastName;
	@FindBy(how=How.NAME, using="email") WebElement email;



	
	public InputFormPage enterFirstName(String fName)
	{
		clearAndType(FirstName,fName);
		return this;
	}
	
	public InputFormPage enterLastName(String lName)
	{
		clearAndType(LastName,lName);
		return this;
	}
	public InputFormPage enterEmail(String eMail)
	{
		clearAndType(email,eMail);
		return this;
	}

}
