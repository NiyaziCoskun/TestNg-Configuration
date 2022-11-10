package com.testng.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReusableMethods {

    public static void sleep(int milisecond) {
        try {
            Thread.sleep(milisecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static List<WebElement> getTitels() {
        return Driver.getDriver().findElements(By.xpath("(//table)[1]//th"));
    }

    public static List<WebElement> getSatirlar(int tablo){
        return Driver.getDriver().findElements(By.xpath("(//table)[1]/tbody/tr"));
    }

    public static List<WebElement> getTumHucreler(int tablo){
        return Driver.getDriver().findElements(By.xpath("(//table)[1]/tbody//td"));

    }

    public static List<WebElement> getSatirdakiHucreler(int satir){
        return Driver.getDriver().findElements(By.xpath("((//table)[1]/tbody/tr)["+satir+"]"));
    }

    public static List<WebElement> getSutun(int sutun){
        return Driver.getDriver().findElements(By.xpath("((//table)[1]//tr/td)["+sutun+"]"));
    }

    public static WebElement getSatirSutun(int satir, int sutun) {
        return Driver.getDriver().findElement(By.xpath("(//table)[1]//tr["+satir+"]/td["+sutun+"]"));
    }



}

