package com.base_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

WebDriver Driver=new ChromeDriver();
Driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=9164975056021961644&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061941&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiA9YugBhCZARIsAACXxeJrsmq_mRFSvAq5tKUHoaVMSCKb-JIJCLXf396XB63N-6fMGxxLx1gaAv9gEALw_wcB");
JavascriptExecutor js=(JavascriptExecutor) Driver;

//WebElement findElement = Driver.findElement(By.xpath("//div[@class='navLeftFooter nav-sprite-v1']"));
//js.executeScript("arguments[0].scrollIntoView();",findElement);
js.executeScript("window.scrollBy(0,2000);");
	}

}
