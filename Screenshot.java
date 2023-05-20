package com.base_selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.youtube.com/");
		Driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot)Driver;
		File from =ts.getScreenshotAs(OutputType.FILE);
		File to=new File("C:\\Users\\Praveen\\eclipse-workspace\\Selenium\\screenshot\\praveen.png");
		FileHandler.copy(from, to);
	}

}
