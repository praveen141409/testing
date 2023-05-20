package com.base_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Login_Task {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js =(JavascriptExecutor) driver;
	Actions mouse=new Actions(driver);
	driver.get("https://adactinhotelapp.com/");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
	driver.manage().window().maximize();
	
	WebElement login = driver.findElement(By.xpath("//input[@type='text']"));
	login.sendKeys("praveenvishwa");
	
	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("praveen123");
	
	WebElement log = driver.findElement(By.xpath("//input[@type='Submit']"));
	mouse.click(log).build().perform();
	
	WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
	Select s =new Select(location);
	s.selectByVisibleText("London");
	
	WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
	Select h =new Select(hotel);
	h.selectByIndex(2);
	
	WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
	Select r=new Select(room);
	r.selectByValue("Deluxe");
	
	WebElement nos = driver.findElement(By.xpath("//select[@name='room_nos']"));
	Select n=new Select(nos);
	n.selectByIndex(2);
	
	WebElement date = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	date.sendKeys("10/03/2023");
	
	WebElement date2 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	date2.sendKeys("11/03/2023");
	
	WebElement findElement = driver.findElement(By.xpath("//select[@id='adult_room']"));
	Select a=new Select(findElement);
	a.selectByIndex(2);
	
	WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
	Select c=new Select(child);
	c.selectByValue("0");
	
	WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
	mouse.click(search).build().perform();
	
	WebElement done = driver.findElement(By.xpath("//input[@type='radio']"));
	mouse.click(done).build().perform();
	
	WebElement con = driver.findElement(By.xpath("//input[@type='submit']"));
	mouse.click(con).build().perform();
	
	WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
	name.sendKeys("praveen");
	
	WebElement last = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
	last.sendKeys("vishwa");
	
	WebElement address = driver.findElement(By.xpath("//textarea[@rows='4']"));
	address.sendKeys("no 87 Thiru.vi.ka nagar,India");
	
	WebElement card = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
	card.sendKeys("1234567890123654");
	
	WebElement bank = driver.findElement(By.xpath("//select[@id='cc_type']"));
	Select ban = new Select(bank);
	ban.selectByIndex(2);
	
	WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
	Select mon=new Select(month);
	mon.selectByIndex(6);
	
	WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	Select y=new Select(year);
	y.selectByIndex(6);
	
	WebElement ccv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	ccv.sendKeys("231");
	
	WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
	mouse.click(book).build().perform();
	
	js.executeScript("window.scrollBy(0,1000);");
	Thread.sleep(6000);
	
	WebElement iter = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
	mouse.click(iter).build().perform();
	}

}
