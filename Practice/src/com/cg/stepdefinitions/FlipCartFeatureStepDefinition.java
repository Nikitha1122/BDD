package com.cg.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.beans.FlipCart;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipCartFeatureStepDefinition {
	private WebDriver driver;
	
	private FlipCart flipCart;
	
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	}
	@Given("^user is on flipcart home page$")
	public void user_is_on_flipcart_home_page() throws Throwable {
	    
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		flipCart=new FlipCart();
		PageFactory.initElements(driver, flipCart);
	}

	@When("^user enters valid product name$")
	public void user_enters_valid_product_name() throws Throwable {
		flipCart.popUp();
		flipCart.setName("oneplus 5");
	    flipCart.clickSignIn();
	}

	@Then("^browser should display the products$")
	public void browser_should_display_the_products() throws Throwable {
		//String actualTitle=driver.getTitle();
		String expected="Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More";
		Assert.assertEquals(expected, flipCart.getActual());
	}


}
