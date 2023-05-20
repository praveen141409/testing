package com.base_selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Task {

	public static void main(String[] args) throws AWTException, InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
 
 WebDriver Driver=new ChromeDriver();
 
 Driver.get("https://www.amazon.in/");
 Driver.manage().window().maximize();
 
 Actions ac=new Actions(Driver);
 
 Robot r=new Robot();
 
 WebElement findElement = Driver.findElement(By.xpath("//a[@class='nav-a  ']"));
 ac.contextClick(findElement).build().perform();
 Thread.sleep(3000);
 
 r.keyPress(KeyEvent.VK_ENTER);
 r.keyRelease(KeyEvent.VK_ENTER);
 Thread.sleep(3000);
 r.keyPress(KeyEvent.VK_ENTER);
 r.keyPress(KeyEvent.VK_ENTER);
 Thread.sleep(3000);
 
 WebElement findElement2 = Driver.findElement(By.xpath("(//a[@tabindex='0'])[7]"));
 ac.contextClick(findElement2).build().perform();
 Thread.sleep(3000);
 
 r.keyPress(KeyEvent.VK_ENTER);
 r.keyRelease(KeyEvent.VK_ENTER);
 Thread.sleep(3000);
 r.keyPress(KeyEvent.VK_ENTER);
 r.keyPress(KeyEvent.VK_ENTER);
 Thread.sleep(3000);
 
 WebElement findElement3 = Driver.findElement(By.xpath("(//a[@tabindex='0'])[8]"));
 ac.contextClick(findElement3).build().perform();
 Thread.sleep(3000);
 
 r.keyPress(KeyEvent.VK_ENTER);
 r.keyRelease(KeyEvent.VK_ENTER);
 Thread.sleep(3000);
 r.keyPress(KeyEvent.VK_ENTER);
 r.keyPress(KeyEvent.VK_ENTER);
 Thread.sleep(3000);
 
 WebElement findElement4 = Driver.findElement(By.xpath("(//a[@tabindex='0'])[9]"));
 ac.contextClick(findElement4).build().perform();
 Thread.sleep(3000);
 
 r.keyPress(KeyEvent.VK_ENTER);
 r.keyRelease(KeyEvent.VK_ENTER);
 Thread.sleep(3000);
 r.keyPress(KeyEvent.VK_ENTER);
 r.keyPress(KeyEvent.VK_ENTER);
 
 //size
 String size = Driver.getWindowHandle();
 System.out.println("window size;" +size);
 
 //parent window id
 String pw = Driver.getWindowHandle();
 System.out.println(pw);
 
 //get all window title
 Set<String> tc = Driver.getWindowHandles();
 for (String ab : tc) {
	 String title = Driver.switchTo().window(ab).getTitle();
	 
	 System.out.println(title);
	 
	 //particular window
	 String actual_window = "Help - Amazon Customer Service";
	 for (String cp : tc) {
		 if(Driver.switchTo().window(cp).getTitle().equals(actual_window)) {
			 break;
		 }
		
	}
	 for (String cp : tc) {
	 if(!cp.equals(pw)) {
			 Driver.switchTo().window(cp);
			 Driver.close();
		 
	 }
	 }	 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		 }
		
	}
	 
	

 
 
 
	}


