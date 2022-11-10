package com.testng.pages;

import com.google.j2objc.annotations.Weak;
import com.testng.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class W3Schools {

    public W3Schools(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy ( xpath = "(//table)[1]//th")
    public List<WebElement> titels;

    @FindBy ( xpath = "(//table)[1]//th")
    public List<WebElement> hucreler;
}
