package com.leafBot.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Home_SignIn_Page extends Annotations{
	
	public Home_SignIn_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="nav-link-accountList") WebElement sign_in;
	@FindBy(how=How.XPATH, using="(//span[text()='Sign in'])[2]") WebElement signIN;
	
	@FindBy(how=How.ID, using="namefield") WebElement name;
	@FindBy(how=How.ID, using="email") WebElement mail;
	@FindBy(how=How.XPATH, using="//input[@name='password']") WebElement pwd;
	@FindBy(how=How.XPATH, using="//input[@name='r_address/2.phone']") WebElement phone;
	
	@FindBy(how=How.ID, using="searchDropdownBox") WebElement search_dropbox;
	
	@FindBy(how=How.XPATH, using="//input[@value='Go']") WebElement go_button;
	
	@FindBy(how=How.XPATH, using="//a[@class='a-link-normal a-text-normal']//span") 
	List<WebElement> all_names;
	
	@FindBy(how=How.XPATH, using="//div[@id='nav-xshop']//a") 
	List<WebElement> all_hover;


	
	
	

	
	
	

	
	
	

	
	
	public LoginCredentialsPage login() throws InterruptedException
	{
		Thread.sleep(3000);
		hover_to_element(sign_in);
		Thread.sleep(1000);
		click(signIN);
		return new LoginCredentialsPage();
	}
	
	public Home_SignIn_Page select_drop_down()
	{
		selectDropDownUsingText(search_dropbox,"Amazon Devices");
		click(go_button);
		
		for (WebElement webElement : all_names) {
			String text = webElement.getText();
			System.out.println(text);
			
		}
		return this;
	}
	public Home_SignIn_Page multi_hover() throws InterruptedException
	{
		int size = all_hover.size();
		
		for(int i=0;i<size;i++)
		{
			Thread.sleep(1000);
			hover_to_element(all_hover.get(i));
			System.out.println(all_hover.get(i).getText());
		}
		return this;
		
		
	}

}
