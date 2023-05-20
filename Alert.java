package com.base_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

WebDriver Driver = new ChromeDriver();
Driver.get("https://demoqa.com/alerts");
Driver.manage().window().maximize();

Thread.sleep(3000);

WebElement findElement = Driver.findElement(By.xpath("//button[@id='alertButton']")); //simple alert
findElement.click();
Thread.sleep(3000);
org.openqa.selenium.Alert salert = Driver.switchTo().alert();
salert.accept();
 
Thread.sleep(3000);
WebElement findElement2 = Driver.findElement(By.xpath("//button[@id='promtButton']"));  //prompt alert
findElement2.click();
org.openqa.selenium.Alert calert = Driver.switchTo().alert();
Thread.sleep(3000);
calert.sendKeys("praveen");
Thread.sleep(3000);
calert.accept();



	}

}
