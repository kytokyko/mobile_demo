package com.leafBot.selenium.api.base;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.leafBot.selenium.api.design.Browser;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class SeleniumBase implements Browser{
    public static AppiumDriver<WebElement> driver;


	@Override
	public boolean startApp(String appPackage, String appActivity, String deviceName) {
		// TODO Auto-generated method stub
		 try {
	            DesiredCapabilities dc = new DesiredCapabilities();
	            dc.setCapability("appPackage", appPackage);
	            dc.setCapability("appActivity", appActivity);
	            dc.setCapability("deviceName", deviceName);
	            dc.setCapability("automationName", "UiAutomator2");
	            dc.setCapability("noReset", true);
	            driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	            Thread.sleep(5000);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return true;
	}

	@Override
	public WebElement locateElement(String locator, String locValue) {
		// TODO Auto-generated method stub
		 try {
	            switch (locator) {
	                case ("id"):
	                    return driver.findElementById(locValue);
	                case ("linkText"):
	                    return driver.findElementByLinkText(locValue);
	                case ("xpath"):
	                    return driver.findElementByXPath(locValue);
	                case ("name"):
	                    return driver.findElementByName(locValue);
	                case ("className"):
	                    return driver.findElementByClassName(locValue);
	                case ("accessID"):
	                    driver.findElementByAccessibilityId(locValue);
	            }
	        }  catch (Exception e) {
	        }
	        return null;
	}

	@Override
	public boolean click(WebElement ele) {
		// TODO Auto-generated method stub
		try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(ele));
            ele.click();

        } catch (Exception e) {
            return false;
        }
        return true;
	}

	@Override
	public boolean scrollFromDownToUpinAppUsingPointerInputUntilElementIsVisible(String locator, String locValue) {
		// TODO Auto-generated method stub
		 while(!eleIsDisplayed(locateElement(locator, locValue))) {
	            scrollFromDownToUpinAppUsingPointerInput();
	        }
	        return true;
	}

	@Override
	public void scrollFromDownToUpinAppUsingPointerInput() {
		// TODO Auto-generated method stub
		 Dimension size = driver.manage().window().getSize();
	        int x1 = (int) (size.getWidth() * 0.5);
	        int y1 = (int) (size.getHeight() * 0.8);
	        int x0 = (int) (size.getWidth() * 0.5);
	        int y0 = (int) (size.getHeight() * 0.2);
	        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
	        Sequence sequence = new Sequence(finger, 1);
	        sequence.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(),
	                x1, y1));
	        sequence.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
	        sequence.addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(),
	                x0, y0));
	        sequence.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
	        driver.perform(Arrays.asList(sequence));

		
	}

	@Override
	public boolean eleIsDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		try {
            if (ele.isDisplayed())
                return true;
        } catch (Exception e) {
            return false;
        }
        return false;
	}

	
}

		

	



