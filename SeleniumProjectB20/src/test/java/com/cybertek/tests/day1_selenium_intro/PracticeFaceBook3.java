package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFaceBook3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://Facebook.com");

        driver.findElement(By.linkText("Create a Page")).click();

        String expectedresult="registration_form";
        String actualtitle=driver.getCurrentUrl();

        if(actualtitle.contains(expectedresult)){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!!");
        }









    }
}
