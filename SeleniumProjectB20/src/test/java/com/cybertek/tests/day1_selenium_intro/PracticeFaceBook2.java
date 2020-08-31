package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFaceBook2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://Facebook.com");

     String actualHeader=driver.findElement(By.tagName("h2")).getText();
     String expectudet="Connect with friends and the world around you on Facebook";

      if(actualHeader.equals(expectudet)){
          System.out.println("PASSED!");
      }else{
          System.out.println("FAILED!!");
}




    }
}
