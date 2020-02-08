package com.leafBot.selenium.api.design;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;

public interface Browser {
	
	 public boolean startApp(String appPackage, String appActivity, String deviceName);

	 public WebElement locateElement(String locator, String locValue);


	 public boolean click(WebElement ele);

	 public boolean scrollFromDownToUpinAppUsingPointerInputUntilElementIsVisible(String locator,String locValue);



	 public void scrollFromDownToUpinAppUsingPointerInput();

	 public boolean eleIsDisplayed(WebElement ele);
	

	
}
