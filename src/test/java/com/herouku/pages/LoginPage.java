package com.herouku.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herouku.utilities.Driver;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(name = "email")
	public WebElement email;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(css = "button[class='button is-dark']")
	public WebElement signin;




	public  void logIN(String username, String password) {
		email.sendKeys(username);
		this.password.sendKeys(password);
		signin.click();
	} 
	
	
}

