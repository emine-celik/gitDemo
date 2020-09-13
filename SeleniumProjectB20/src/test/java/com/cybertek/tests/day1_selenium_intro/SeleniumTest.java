package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        //1- set up the web driver
        WebDriverManager.chromedriver().setup();

        //2- craete the instance of the chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //3- TEST IF DRIVERS IS WORKING
        driver.get("https://www.google.com");


        System.out.println("The title of the page is: "+driver.getTitle());



        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();







    }

    public static class BasicNavigation {
        public static void main(String[] args)throws Throwable{
            // to set up crome driver
            WebDriverManager.chromedriver().setup();

            //to creat an object of CromeDriver class
            ChromeDriver driver= new  ChromeDriver();

            String url="http://google.com";
            String url1="http://facebook.com";

            //Will open browser with URL
            driver.get(url);

            //will put on hold current run on 3 seconds
            Thread.sleep(3000);

            // will close web browser
           // driver.close();

           driver.get(url1);

            Thread.sleep(3000);

            driver.close();










        }
    }
}
