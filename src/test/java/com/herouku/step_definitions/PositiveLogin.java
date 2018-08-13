package com.herouku.step_definitions;

import static org.junit.Assert.assertEquals;

import com.herouku.pages.HomePage;
import com.herouku.pages.LoginPage;
import com.herouku.utilities.BrowserUtils;
import com.herouku.utilities.ConfigurationReader;
import com.herouku.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveLogin {
	
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	}

	@When("the user enters username {string} and password {string}")
	public void the_user_enters_username_and_password(String email, String password) {
		loginPage.email.sendKeys(email);
		loginPage.password.sendKeys(password);
	}

	@When("the user clicks on the Sign in link")
	public void the_user_clicks_on_the_Sign_in_link() {
		loginPage.signin.click();
		BrowserUtils.waitFor(2);
	}

	@Then("label {string} and {string} should be displayed")
	public void label_and_should_be_displayed(String labelVA, String labelLightSide) throws InterruptedException {
		BrowserUtils.waitFor(5);
		assertEquals( labelVA, homePage.va.getText() );
		assertEquals(labelLightSide ,  homePage.lightSide.getText() );
	}

}
