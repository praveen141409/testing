package com.base_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://demoqa.com/select-menu");
		
		WebElement dropdown = Driver.findElement(By.id("cars"));
		
		Select s=new Select(dropdown);
	//	s.selectByIndex(0);
		//s.selectByValue("3");
		//s.selectByVisibleText("White");
	//	s.selectByIndex(0);
	//	s.selectByValue("volvo");
	//	s.selectByVisibleText("audi");
		
		s.deselectByIndex(3);
		
		
	}

}
