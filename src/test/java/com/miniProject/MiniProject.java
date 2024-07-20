package com.miniProject;

import java.io.IOException;

import org.apache.poi.hpsf.PropertySet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adactin.baseClass.BaseClass;
import com.pom.LoginPage;
import com.pom.SingleTonDesignPattern;
import com.property.ConfigurationHelper;

public class MiniProject extends BaseClass {
	public static void main(String[] args) throws IOException {
	
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Nayanika\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//propertySet("Chrome");
		//ConfigurationHelper ch=new ConfigurationHelper();
		//propertySet(ch.getInstance().getbrowser());
		propertySet(ConfigurationHelper.getInstance().getbrowser());
		
		
		//driver.get("https://adactinhotelapp.com/");
	   urlLaunch("https://adactinhotelapp.com/index.php");
		//driver.manage().window().maximize();
		//urlLauch(ch.getInstance().geturl());
		urlLaunch(ConfigurationHelper.getInstance().geturl());  //configuration helper
		
				
		//LoginPage lp=new LoginPage(driver); driver initializing for loginpage
				
		SingleTonDesignPattern sdp=new SingleTonDesignPattern(driver); //driver initializing for singletondesignpattern 
		
		
		//WebElement username = driver.findElement(By.id("username"));
		//username.sendKeys("Bala112233");
		//userInput(username, "Bala112233");         //calling method from base class
		//userInput(lp.getUsername(),"Bala112233");  // calling method from loginpage
		//userInput(sdp.getLoginPage().getUsername(),"Bala112233"); //calling method from singletondesignpattern
		userInput(sdp.getLoginPage().getUsername(),ConfigurationHelper.getInstance().getuser());  //configuration helper
				
				
		
		//WebElement password = driver.findElement(By.id("password"));
		//username.sendKeys("0E2B6Q");    
		//userInput(password,"0E2B6Q");  //calling method from base class 
		//userInput(lp.getPassword(),"0E2B6Q");   //calling method from loginpage
		
		//userInput(sdp.getLoginPage().getPassword(),"0E2B6Q");  //  calling method from singletondesignpattern
		userInput(sdp.getLoginPage().getPassword(),ConfigurationHelper.getInstance().getpass());  //configuration helper
		
	
		//WebElement login = driver.findElement(By.id("login"));
		//login.click();
		//clickOnElement(login);  //calling method from baseclass
		//clickOnElement(lp.getLoginBtn());  //calling method from loginPage
		clickOnElement(sdp.getLoginPage().getLoginBtn());  //calling method from singletondesignpattern
		 
		WebElement location = driver.findElement(By.id("location"));
		DropDown(location, "text", "Melbourne");
		
		screenshot("C:\\Users\\Nayanika\\eclipse-workspace\\MavenProject\\screenshot\\scr1.png");
		
	}

	private static void urlLaunch(String geturl) {
		// TODO Auto-generated method stub
		
	}
	
	
	

	
		
	}
	
	


