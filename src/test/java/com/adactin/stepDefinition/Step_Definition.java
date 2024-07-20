package com.adactin.stepDefinition;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition {
	
	public static WebDriver driver=Test_Runner.driver;	
@Given("^user Launch the Website$")
public void user_Launch_the_Website() throws Throwable {
   driver.get("https://adactinhotelapp.com/");
   driver.manage().window().maximize();
}

@When("^user Enter Their username In Username Field$")
public void user_Enter_Their_username_In_Username_Field() throws Throwable {
	WebElement username=driver.findElement(By.id("username"));
	username.sendKeys("Bala112233");
   
}

@When("^user Enter Their Password In Password Field$")
public void user_Enter_Their_Password_In_Password_Field() throws Throwable {
	WebElement pswd=driver.findElement(By.id("password"));
	pswd.sendKeys("0E2B6Q");
    
}

@Then("^user Click the login Button And It Navigates To Search Hotel Page$")
public void user_Click_the_login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
	WebElement login = driver.findElement(By.id("login"));
	login.click();
	

}



}
   