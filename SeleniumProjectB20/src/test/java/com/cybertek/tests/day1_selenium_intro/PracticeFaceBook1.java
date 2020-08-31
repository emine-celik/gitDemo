package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFaceBook1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://Facebook.com");

        driver.findElement(By.id("email")).sendKeys("emine@hotmail.com");
        driver.findElement(By.id("pass")).sendKeys("3245677");

        String expextedTitle="“Log into Facebook | Facebook";
        String acualTitle=driver.getTitle();

        if(acualTitle.equals(expextedTitle)){
            System.out.println("PASSED!!");
        }else{
            System.out.println("FAILED!!");
        }




    }
    }
