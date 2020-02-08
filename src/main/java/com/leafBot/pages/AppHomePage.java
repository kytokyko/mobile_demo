package com.leafBot.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class AppHomePage extends Annotations{

    public AppHomePage()
    {
        PageFactory.initElements(driver, this);
    }

    public App_search_page search_usecase() {
        WebElement search_icon = driver.findElementsById("com.amazon.avod.thirdpartyclient:id/icon").get(1);
        click(search_icon);
        return new App_search_page();

    }






    public void scroll()
    {
//
        scrollFromDownToUpinAppUsingPointerInputUntilElementIsVisible("xpath","//android.widget.TextView[@text='Amazon Original series']");
       WebElement tab= driver.findElementByXPath("//android.widget.TextView[@text='Amazon Original series']");
       if(tab.isDisplayed())
       {
           click(tab);
       }else {
           System.out.println("tab not present");
       }
    }





    public void icons_click() throws InterruptedException {
        List <WebElement> parent_element=driver.findElementsByXPath("//android.widget.ImageView[contains(@resource-id,'com.amazon.avod.thirdpartyclient:id/icon')]");
        int length=parent_element.size();
        System.out.println(length);
        for (int i=0;i<=length-1;i++)
        {
            Thread.sleep(4000);
            click(parent_element.get(i));
        }

//        for (WebElement child_element:parent_element)
//        {
//
//            click(child_element);
//            Thread.sleep(4000);
//
//
//        }


    
    }  

}
