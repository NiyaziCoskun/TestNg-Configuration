package com.testng.utilities;

public class ReusableMethods {

    public static void sleep(int numaber) {
        try {
            Thread.sleep(numaber);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
