package com.testng.pages;

import com.testng.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {
     public AmazonPage(){
         PageFactory.initElements(Driver.getDriver(), this);
     }

     @FindBy ( id = "twotabsearchtextbox")
     public WebElement searchbox;


}
