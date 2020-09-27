package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupmethod(){
      driver = WebDriverFactory.getDriver("chrome");
      driver.manage().window().maximize();


     // implicitlyWait: waits until the page is loaded for given time.
        // it will wait up to 15 seconds. if page is loaded before that
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void google_Title_verification(){
        // 1- Go to Google
        driver.get("https://www.google.com");

        // 2- Verify title is Google
        String expectedTitle ="Google";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle,"Titles are not matching!!!");

    }

    @Test
    public void google_search_title_verification(){
        // go to google

        // search apple
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple"+ Keys.ENTER);
        // make sure title contains apple
        String expectedInTitle="apple";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle),"Title does not contain search value.");

    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException{
        Thread.sleep(3000);
    }

}
