package com.testng.tests;


import com.testng.utilities.Driver;
import com.testng.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class GoogleSearchTest {

    @Test
    public void  searchTest() {

        //Der Treiber(Driver) startet und geht zur Google-Seite
        Driver.getDriver().get("https://www.amazon.com");

        WebElement searchbox2 = Driver.getDriver().findElement(By.xpath("//input[@id= 'twotabsearchtextbox']"));

        WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("telefon");

        Driver.getDriver().navigate().to("https://www.amazon.com/-/de/dp/B07HH1QSLB/ref=sr_1_84?__mk_de_DE=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=2PZNWTLE1H4L1&keywords=headphones&qid=1667847425&sprefix=headphone%2Caps%2C177&sr=8-84");

        WebElement titel  = Driver.getDriver().findElement(By.tagName("h1"));
        String titelString = titel.getText();

        WebElement cevaplananSorular  = Driver.getDriver().findElement(By.partialLinkText("67 beantwortete Fragen"));
        String cevaplananSorularString = cevaplananSorular.getText();

        List<WebElement> links = Driver.getDriver().findElements(By.tagName("a"));

        for (WebElement element : links) {
            System.out.println(element.getText());
        }


        //5 Sekunden warten
        ReusableMethods.sleep(5000);

        //Lass uns den Titel bekommen
        //String titel = Driver.getDriver().getTitle();
        //System.out.println(titel);
        System.out.println(Driver.getDriver().getTitle());

        //Amazon click
        Driver.getDriver().navigate().to("https://www.amazon.com");

        //Lass uns den Titel bekommen
        //String titel = Driver.getDriver().getTitle();
        //System.out.println(titel);
        System.out.println(Driver.getDriver().getTitle());

        //zurück google.com
        Driver.getDriver().navigate().back();

        ReusableMethods.sleep(2000);

        //zurück amazon.com
        Driver.getDriver().navigate().forward();

        //Die Methode in der Treiberklasse(driver class) wird aufgerufen
        Driver.closeDriver();


    }
}
