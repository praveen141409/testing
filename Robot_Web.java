package com.base_selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.graph.ElementOrder.Type;

public class Robot_Web{
	
	public static void main(String[] args) throws AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver Driver=new ChromeDriver();
Driver.get("https://www.facebook.com/"); 
Driver.manage().window().maximize();
 Robot r=new Robot();
 
 //r.keyPress(KeyEvent.VK_PAGE_DOWN);
 //r.keyRelease(KeyEvent.VK_PAGE_DOWN);
 
r.keyPress(KeyEvent.VK_CAPS_LOCK);


r.keyRelease(KeyEvent.VK_CAPS_LOCK);

r.keyPress(KeyEvent.VK_A);

r.keyPress(KeyEvent.VK_CAPS_LOCK);

r.keyRelease(KeyEvent.VK_CAPS_LOCK);

r.keyPress(KeyEvent.VK_A);

//TakesScreenshot ts=(TakesScreenshot)Driver;
//File from= ts.getScreenshotAs(OutputType.FILE);
//File to=new File ("C:\\Users\\Praveen\\eclipse-workspace\\Selenium\\screenshot\\viswa.png");
//FileHandler.copy(from, to);

r.keyPress(KeyEvent.VK_0);
r.keyRelease(KeyEvent.VK_0);
	}

}
