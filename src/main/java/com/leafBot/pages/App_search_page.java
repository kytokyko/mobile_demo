package com.leafBot.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class App_search_page extends Annotations{
    public App_search_page()
    {
        PageFactory.initElements(driver, this);
    }
    
    
    //

    public Tamil_page scroll_to_language() throws InterruptedException {
    Thread.sleep(3000);
    
    
    
    
//    for ( WebElement lan : languages) {
//    	System.out.println(lan.getText());
//		
//	}
        
    scrollFromDownToUpinAppUsingPointerInputUntilElementIsVisible("xpath","//android.widget.TextView[@text='Tamil']");
       WebElement tamil_lang=driver.findElementByXPath("//android.widget.TextView[@text='Tamil']");
       click(tamil_lang);

       if(tamil_lang.isDisplayed())
      {
          click(tamil_lang);
     }else {
          System.out.println("not there");
      }
        return new Tamil_page();
    }
}
