package com.base_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Interface {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver Driver= new ChromeDriver();
		
		Driver.get("https://demoqa.com/droppable");
		Driver.manage().window().maximize();
		
		Actions ac =new Actions(Driver);
		
	//	WebElement findElement = Driver.findElement(By.xpath("//div[@class='header-text']"));
	//	ac.click(findElement).build().perform();
		
	//	Thread.sleep(3000);
		
	//	WebElement findElement2 = Driver.findElement(By.xpath("//div[@class='header-text']"));
	//	ac.contextClick(findElement2).build().perform();
		//Thread.sleep(3000);
		
	//	WebElement findElement3 = Driver.findElement(By.xpath("//div[@class='header-text']"));
	//	ac.doubleClick(findElement3).build().perform();
		
		WebElement findElement4 = Driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement findElement5 = Driver.findElement(By.xpath("//div[@id='droppable']"));
		//ac.dragAndDrop(findElement4, findElement5).build().perform();
		
	ac.clickAndHold(findElement4).moveToElement(findElement4).release(findElement5).build().perform();
		
	}

}
