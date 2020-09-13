package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_Ebay {
    public static void main(String[] args)throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver dirver=new ChromeDriver();
        dirver.manage().window().maximize();

        dirver.get("http://ebay.com");
        String title= dirver.getTitle();
        System.out.println("My title is: "+title);
        Thread.sleep(3000);


        dirver.findElement(By.id("gh-ac")).sendKeys("book"+ Keys.ENTER);
        Thread.sleep(3000);




















    }
}
