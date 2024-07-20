package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pswd;
	
	@FindBy(id="login")
   private WebElement loginBtn;
	
	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);  //initializing driver to the methods present in this class.
	}
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}		
		public WebElement getPassword() {
			return pswd;
		}
			
			public WebElement getUsername() {
				return user;	
			
			
			
	}
	

}
