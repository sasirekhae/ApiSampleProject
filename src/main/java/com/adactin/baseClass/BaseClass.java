package com.adactin.baseClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	
	public static void userInput(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void clickOnElement(WebElement element) {
		element.click();
		
	}

	public static WebDriver propertySet(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Nayanika\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
			driver=new ChromeDriver(); 
			
		} else if(browser.equalsIgnoreCase("firfox")){
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Nayanika\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");//use firefox saved path in system
			driver=new FirefoxDriver();
			
		}else {
			System.out.println("Invalid browser");

		}
		driver.manage().window().maximize();
		return driver;
		}
			
	//	public static void close() {
			//driver.close();
			
		//}
	//	public static void quit() {
			//driver.quit();
		//}
		public static void DropDown(WebElement element,String methods,String value) {
			Select s=new Select(element);
			if(methods.equalsIgnoreCase("text")) {
				s.selectByVisibleText(value);
				
			}
			else if(methods.equalsIgnoreCase("Index")) {
				int int1 = Integer.parseInt(value);
				s.selectByIndex(int1);
			}
			else if(methods.equalsIgnoreCase("Value")) {
				s.selectByValue(value);
			}
		}	
public static void alerts(String methods,String value) {
	Alert a=driver.switchTo().alert();
	if (methods.equalsIgnoreCase("accept")) {
		a.accept();
		
	}else if (methods.equalsIgnoreCase("dismiss")) {
		a.dismiss();
		
	}
	else if(methods.equalsIgnoreCase("sendkeys")) {
		a.sendKeys(value);
	}
		
	}
	public static void screenshot(String path) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File(path);
		FileUtils.copyFile(source, destination);
	}
	
	public static void frame(WebElement element,String value) {
		driver.switchTo().frame(0);
		
	}
}
		
	
		
		
	

