package com.base_selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Drop_Task {
	public static void main(String[]args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?i=toys&bbn=1350380031&rh=n%3A1350380031%2Cp_n_specials_match%3A21618256031%2Cp_85%3A10440599031&dc&ds=v1%3AXlf5la5G4OzAY3tIvZxEPfhBn52ZDIeP%2Fyd68wS7Wgs&_encoding=UTF8&pd_rd_r=1b4fc668-a31d-4c38-8d8f-42a4bc5062df&pd_rd_w=hFf6w&pd_rd_wg=sAKea&pf_rd_p=4800efb7-2b91-44b2-8ede-1a4b6b886bd0&pf_rd_r=B74NXPKDRMM911FKCZV5&qid=1667210682&rnid=10440598031&rw_html_to_wsrp=1&ref=pd_gw_unk");
	Actions ac=new Actions(driver);
WebElement sc = driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
ac.click(sc).build().perform();
WebElement findElement = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-radio'])[3]"));
ac.click(findElement).build().perform();
//Select s=new Select(sc);
//Thread.sleep(3000);
//s.selectByIndex(1);
//Robot r=new Robot();

//r.keyPress(KeyEvent.VK_DOWN);
//r.keyRelease(KeyEvent.VK_DOWN);
//r.keyPress(KeyEvent.VK_ENTER);
//r.keyRelease(KeyEvent.VK_ENTER);

	}

}
