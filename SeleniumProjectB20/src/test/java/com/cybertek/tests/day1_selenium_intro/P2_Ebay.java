package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_Ebay {
    public static void main(String[] args)throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://ebay.com");

        String expectedInTitle="Electronic, cars, fashion";
        String acualTitle=driver.getTitle();

        if(acualTitle.equals(expectedInTitle)){
            System.out.println("Verify web page PASSED!");
        }else{
            System.out.println("Verify Web page FAILED!!");
        }

        // driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F");
        //  driver.get("http://google.com");
        // driver.findElement(By.linkText("q")).sendKeys("Apple"+ Keys.ENTER);

        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.name("username")).sendKeys("emineclk");





    }
}
