package com.selenium.script.DevOps_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        //System.out.println( "Hello World!" );
    	//Initialize web driver
    	System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");//"/Users/umang/Downloads/chromedriver_win32/chromedriver.exe");
    	ChromeOptions chromeOptions = new ChromeOptions();
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	
    	//Open the application url in browser
    	driver.get("https://www.facebook.com/login/");
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	
    	//locate and fill textboxes
    	//Thread.sleep(3000);
    	driver.findElement(By.id("email")).sendKeys("aaramharaamhai@gmail.com");
		//Thread.sleep(3000);
    	driver.findElement(By.id("pass")).sendKeys("Iamgoodguy00");
    	//Thread.sleep(3000);
    	//click on login button
    	driver.findElement(By.id("loginbutton")).click();
    	//Thread.sleep(5000);
    	//validate info
    	
    	//quie driver
    	driver.quit();    	
    }
}
