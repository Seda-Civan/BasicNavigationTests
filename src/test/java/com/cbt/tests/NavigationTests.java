package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) {

        chrome();
        safari();
        firefox();
    }

    public static void testCase(String browser){

        WebDriver driver = BrowserFactory.getDriver(browser);
        driver.get("https://google.com/");
        String titleGoogle = driver.getTitle();
        driver.get("https://etsy.com/");
        String titleEtsy = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(titleGoogle, driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(titleEtsy, driver.getTitle());

        driver.quit();
    }

    public static void chrome(){

      testCase("chrome");
    }

    public static void safari(){

        testCase("safari");
    }

    public static void firefox(){

       testCase("firefox");
    }


}
