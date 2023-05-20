package com.base_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Task {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Praveen\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver Driver =new ChromeDriver();
		Driver.get("https://www.instagram.com/accounts/login/");
		Driver.manage().window().maximize();
	}

}
