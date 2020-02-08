package com.leafBot.testng.api.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.leafBot.selenium.api.base.SeleniumBase;

import utils.DataLibrary;

public class Annotations extends SeleniumBase {
	
	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}	
  
  @BeforeMethod
  public void beforeMethod() {
	startApp("chrome", "https://www.amazon.in/");
	node = test.createNode(testcaseName);
  }

	
  @AfterMethod
	  public void afterMethod() throws InterruptedException
	  {
	  Thread.sleep(3000);
	  close(); 
	  }
	 
  
  
  
  
  
  
  
  
  
  
  
  

}
