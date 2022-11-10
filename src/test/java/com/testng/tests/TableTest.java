package com.testng.tests;

import com.testng.pages.W3Schools;
import com.testng.utilities.Driver;
import com.testng.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {
    W3Schools schools = new W3Schools();

    @Test
    public void allTitels() {
        String url = "https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);

        //List<Element>
        for (WebElement element : schools.titels) {
            System.out.println(element.getText());
        }

    }

    @Test
    public void allHucreler() {
        String url = "https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);

        //List<Element>
        for (WebElement element : schools.hucreler) {
            System.out.println(element.getText());
        }

    }

    @Test
    public void tumBasliklarReusableMethods(){
        String url = "https://www.w3scools.com/html/html_tables.asp";
        Driver.getDriver().get(url);

        List<WebElement> liste = ReusableMethods.getTitels();

        for (WebElement element : liste) {
            System.out.println(element.getText());
            
        }
    }

    @Test
    public void satirSutunTesti() {
        String url = "https://www.w3scools.com/html/html_tables.asp";
        Driver.getDriver().get(url);

        WebElement element = ReusableMethods.getSatirSutun(5,3);

        System.out.println(element.getText());
    }

}
