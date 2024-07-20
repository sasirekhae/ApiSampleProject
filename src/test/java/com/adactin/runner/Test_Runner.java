package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature\\adactin.feature",
glue="com.adactin.stepDefinition")

//monochrome=true,
//dryRun=true,
//strict=true,
//tags=("@tagname"),
//plugin= {""

public class Test_Runner {
	public static WebDriver driver;
	
	@BeforeClass
public static void set_Up() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Nayanika\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	
	
}
	@AfterClass
	public static void tear_Down() {
		driver.close();
	}

}
