package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank2 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");
        //driver.findElement(By.linkText("Zero Bank")).click();
        String actualResult1 = driver.findElement(By.className("brand")).getText();

        String expectedresult="Zero Bank";
      // String actualtitle=driver.getTitle();

        if(actualResult1.equals(expectedresult)){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!!");
        }



    }
}