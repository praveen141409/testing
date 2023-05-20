package com.base_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver Driver =new ChromeDriver();
		Driver.get("https://demo.automationtesting.in/Frames.html");
		Driver.manage().window().maximize();
		
		Driver.switchTo().frame(0);
		WebElement findElement = Driver.findElement(By.xpath("//input[@type='text']"));
		findElement.sendKeys("78945");
		Driver.switchTo().defaultContent();
		
		WebElement nestedframe = Driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		nestedframe.click();
		
		
		
	}

}
