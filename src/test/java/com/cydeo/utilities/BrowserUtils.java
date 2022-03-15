package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserUtils {

/*
This method will accept int (in seconds) and execute Thread.sleep
    for given duration
 */

    public static void sleep (int second){

        second *= 1000;

        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }








    }




    public static void switchWindowAndVerify (String expectedUrl, String expectedTitle ){

        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();


        for (String each : allWindowsHandles) {
            Driver.getDriver().switchTo().window(each) ;
            System.out.println("Current URL: "+Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedUrl)){

                break;

            }

        }


//5. Assert: Title contains “expectedTitle”

        String actualTitle = Driver.getDriver().getTitle();
       Assert.assertTrue(actualTitle.contains(expectedTitle));


    }
/*
    This method accepts a String "expectedTitle" and Asserts if it is true
     */

    public static void verifyTitle(String expectedTitle){

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }


}