package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.AppHomePage;
import com.leafBot.testng.api.base.Annotations;

public class TC_001 extends Annotations{

    @Test
    public void click_element() throws InterruptedException {
        new AppHomePage().search_usecase().scroll_to_language();

    }
}
