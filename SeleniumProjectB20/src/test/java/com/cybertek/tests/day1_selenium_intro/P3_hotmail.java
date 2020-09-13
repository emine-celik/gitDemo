package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_hotmail {
    public static void main(String[] args)throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("http://hotmail.com");
        Thread.sleep(3000);

        driver.findElement(By.linkText("Sign in")).click();

        driver.findElement(By.name("loginfmt")).sendKeys("emineclk80@hotmail.com"+ Keys.ENTER);
        driver.findElement(By.name("passwd")).sendKeys("787559080"+Keys.ENTER);

        driver.findElement(By.linkText("Sign in")).click();




    }
}
