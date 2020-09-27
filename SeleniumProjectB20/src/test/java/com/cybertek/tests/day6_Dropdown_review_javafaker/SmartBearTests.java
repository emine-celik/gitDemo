package com.cybertek.tests.day6_Dropdown_review_javafaker;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearTests {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @Test
    public void task1_login_page_links_print_test(){
        WebElement useranameInput = driver.findElement(By.id("ctl00_MainContent_username"));
        useranameInput.sendKeys("Tester");

        WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordInput.sendKeys("test");

        WebElement loggingButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loggingButton.click();

      List<WebElement> allLinks=driver.findElements(By.xpath("//body//a"));

        System.out.println("Count of all the links on the page = " + allLinks.size());

        for(WebElement eachLink: allLinks){
            System.out.println("eachLink = "+eachLink.getText());
        }

    }

    @AfterMethod
    public void close()throws InterruptedException{
        Thread.sleep(1000);
        close();
    }





}
