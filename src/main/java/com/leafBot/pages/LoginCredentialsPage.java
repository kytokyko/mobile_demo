package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class LoginCredentialsPage extends Annotations{
	
	public LoginCredentialsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="ap_email") WebElement Email;
	@FindBy(how=How.ID, using="continue") WebElement continue_button;
	@FindBy(how=How.ID, using="ap_password") WebElement pwd;
	@FindBy(how=How.ID, using="signInSubmit") WebElement login;

	
	


	public LoginCredentialsPage email(String email)
	{
		clearAndType(Email,email);
		click(continue_button);
		return this;
	}
	public LoginCredentialsPage password(String password)
	{
		clearAndType(pwd,password);
		click(login);
		return this;
	}
}
