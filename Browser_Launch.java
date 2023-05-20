package com.base_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
public static void main(String[] args) throws InterruptedException {
	
	
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
 
 
WebDriver Driver = new ChromeDriver();

Driver.get("https://www.facebook.com/login/");

//WebElement findElement = Driver.findElement(By.id("email")); 
//findElement.sendKeys("praveenvishwa");

//WebElement findElement2 = Driver.findElement(By.name("pass"));
//findElement2.sendKeys("56456");
//WebElement findElement3 = Driver.findElement(By.id("loginbutton"));
//findElement3.click();
Driver.manage().window().maximize();

String title = Driver.getTitle();
System.out.println("title ;" +title);

String currentUrl = Driver.getCurrentUrl();
 System.out.println("currenturl" + currentUrl);
 
 //navigate
 //Driver.navigate().to("https://www.instagram.com/accounts/login/");
 //Thread.sleep(3000);
 //Driver.navigate().to("https://www.youtube.com/");
 //Thread.sleep(3000);
 //Driver.navigate().back();
 //Thread.sleep(3000);
 //Driver.navigate().forward();
 
 //Driver.close();
 
 //xpath
 //WebElement findElement = Driver.findElement(By.xpath("//input[@type='text']"));
 WebElement findElement = Driver.findElement(By.id("email"));
 findElement.sendKeys("praveen");
 
}
}
