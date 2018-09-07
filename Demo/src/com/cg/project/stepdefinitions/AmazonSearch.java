package com.cg.project.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.beans.Amazon;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSearch {
	private WebDriver driver;
	
	private Amazon amazon;
	
	
	
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	}
	
	@Given("^user is on amazon home page$")
	public void user_is_on_amazon_home_page() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		amazon=new Amazon();
		PageFactory.initElements(driver, amazon);
	    
	}

	@When("^user search for product name$")
	public void user_search_for_product_name() throws Throwable {
		
		amazon.setName("RedmiNote5");
		amazon.clickSignIn();
	
		
		/*WebElement name=driver.findElement(By.id("twotabsearchtextbox"));
		name.sendKeys("RedmiNote5");
		name.submit();*/
	    
	    
	}

	@Then("^it should display the products$")
	public void it_should_display_the_products() throws Throwable {
		String actualTitle=driver.getTitle();
		String expected="Amazon.in: RedmiNote5 - Smartphones / Smartphones & Basic Mobiles: Electronics";
		Assert.assertEquals(expected, actualTitle);
		//driver.close();
	    
	   
	}


}
