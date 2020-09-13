package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WurmUpClass {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();

        driver.get("http://google.com");

        driver.findElement(By.linkText("Gmail")).click();

        String expectedInTitle="same";
        String acualTitle=driver.getTitle();

        if(acualTitle.contains(expectedInTitle)){
            System.out.println("Gmail Title verification PASSED!");
        }else{
            System.out.println("Gmail Title verification FAILED!!");
        }
        driver.navigate().back();
       // driver.get("http://google.com");
        driver.findElement(By.linkText("Sign in")).click();







    }
}
