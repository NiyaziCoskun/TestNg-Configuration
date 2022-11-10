package com.testng.tests;

import com.testng.pages.AmazonPage;
import com.testng.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AmazonSearchTest {

    AmazonPage page = new AmazonPage();

    @Test
    public void serachtesti(){
        Driver.getDriver().get("https://amazon.com");

        page.searchbox.sendKeys("iphone" + Keys.ENTER);
    }
}
