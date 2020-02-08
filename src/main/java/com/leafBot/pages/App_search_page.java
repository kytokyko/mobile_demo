package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class App_search_page extends Annotations{
    public App_search_page()
    {
        PageFactory.initElements(driver, this);
    }
    public Tamil_page scroll_to_language() throws InterruptedException {
        Thread.sleep(3000);
        scrollFromDownToUpinAppUsingPointerInputUntilElementIsVisible("xpath","//android.view.ViewGroup[@index='11']");
        WebElement tamil_lang=driver.findElementByXPath("//android.view.ViewGroup[@index='11']");

        if(tamil_lang.isDisplayed())
        {
            click(tamil_lang);
        }else {
            System.out.println("not there");
        }
        return new Tamil_page();
    }
}
