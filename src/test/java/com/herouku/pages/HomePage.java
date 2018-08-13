package com.herouku.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herouku.utilities.Driver;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//h1[@class='title']")
		    public WebElement va;
		    
		    @FindBy(xpath = "//h2[@class='subtitle']")
		    public WebElement lightSide;
	

}
