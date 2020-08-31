package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(" http://zero.webappsecurity.com/login.html");

        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");

        driver.findElement(By.name("submit")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Account Activity")).click();

        String expectedresult="Zero - Account Activity";
        String actualtitle=driver.getTitle();

        if(actualtitle.equals(expectedresult)){
            System.out.println("Account activity Passed!");
        }else{
            System.out.println("Account activity Failed!!");
        }


        Thread.sleep(3000);

       driver.findElement(By.linkText("Transfer Funds")).click();

        String expectedresult1="Zero - Transfer Funds";
        String actualtitle1=driver.getTitle();

        if(actualtitle.equals(expectedresult)){
            System.out.println("Transfer founds  Passed!");
        }else{
            System.out.println("Transfer founds Failed!!");
        }


        Thread.sleep(3000);

        driver.findElement(By.linkText("Pay Bills")).click();

        String expectedresult2="Zero - Pay Bills";
        String actualtitle2=driver.getTitle();

        if(actualtitle.equals(expectedresult)){
            System.out.println("Pay Bills Passed!");
        }else{
            System.out.println("Pay Bills Failed!!");
        }


        Thread.sleep(3000);

        driver.findElement(By.linkText("My Money Map")).click();

        String expectedresult3="Zero - My Money Map";
        String actualtitle3=driver.getTitle();

        if(actualtitle.equals(expectedresult)){
            System.out.println("My Money Map Passed!");
        }else{
            System.out.println("My Money Map Failed!!");
        }


        Thread.sleep(3000);


        driver.findElement(By.linkText("Online Statements")).click();

        String expectedresult4="Zero - Online Statements";
        String actualtitle4=driver.getTitle();

        if(actualtitle.equals(expectedresult)){
            System.out.println("Online Statements Passed!");
        }else{
            System.out.println("Online Statements Failed!!");
        }










    }
    }