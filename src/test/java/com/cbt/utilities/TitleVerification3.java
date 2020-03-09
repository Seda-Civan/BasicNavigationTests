package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

    public static void main(String[] args) {

        WebDriver driver =  BrowserFactory.getDriver("chrome");

        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/",
                "https://wayfair.com/", "https://walmart.com", "http://westelm.com/");

        driver.manage().window().maximize();


        //Visit all websites one by one.
        //Verify that URL of the website contains the title of the website. Ignore spaces and case
        //in comparison. For example, title of in the first website title is Lulu and Giorgia and the
        //URL is https://lulugandgeorgia.com. So, this test case must pass.
        //open and close a new browser for each web site.
        for (int i = 0; i < urls.size(); i++) {
            driver.get(urls.get(i));
            String title = driver.getTitle();
            System.out.println("title = " + title);
            if(urls.get(i).contains(title.toLowerCase().replace(" ","")) ){
                System.out.println("PASSED");
            }else{
                System.out.println("FAILED");
            }
            driver.quit();
            System.out.println();
            driver =  BrowserFactory.getDriver("chrome");
        }
        driver.quit();
    }
}
