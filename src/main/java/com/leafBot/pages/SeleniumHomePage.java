package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class SeleniumHomePage extends Annotations {
	
	public SeleniumHomePage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.CLASS_NAME, using="dropdown-toggle") WebElement input_DropDown;

	@FindBy(how=How.LINK_TEXT, using="Select Dropdown List") WebElement drop_down_select;
	
	@FindBy(how=How.LINK_TEXT, using="Input Form Submit") WebElement input_form_submit;
	
	@FindBy(how=How.LINK_TEXT, using="Checkbox Demo") WebElement checkbox_select;
	
	@FindBy(how=How.LINK_TEXT, using="Radio Buttons Demo") WebElement radio_button;
	
	@FindBy(how=How.LINK_TEXT, using="JQuery Select dropdown") WebElement jqueryDropDown;
	
	@FindBy(how=How.XPATH, using="(//a[@class='dropdown-toggle'])[2]") WebElement date_picker;
	
	@FindBy(how=How.LINK_TEXT, using="Bootstrap Date Picker") WebElement bootstrap_datepicker;






	
	

	public DropDownSelectPage selectDropDown()
	{
		click(input_DropDown);
		click(drop_down_select);
		return new DropDownSelectPage();

	}
	
	public InputFormPage select_input_form()
	{
		click(input_DropDown);
		click(input_form_submit);
		return new InputFormPage();
	}
	
	public CheckBoxPage check_box()
	{
		click(input_DropDown);
		click(checkbox_select);
		return new CheckBoxPage();

	}
	
	public RadioButtonPage radioButton()
	{
		click(input_DropDown);
		click(radio_button);
		return new RadioButtonPage();
	}
	
	public JqueryDropDownPage jqueryDropdown()
	{
		click(input_DropDown);
		click(jqueryDropDown);
		return new JqueryDropDownPage();
		
	}
	public DatePickerPage datePicker()
	{
		click(date_picker);
		click(bootstrap_datepicker);
		return new DatePickerPage();
	}
}
