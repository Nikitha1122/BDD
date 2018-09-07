package com.cg.project.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NaukriRegistrationFeatureStepDefinition {
	
	private WebDriver driver;
	

	@Given("^user is on the home page of 'Naukri\\.com'$")
	public void user_is_on_the_home_page_of_Naukri_com() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
	   
	}

	@When("^user click on 'Register with us'button$")
	public void user_click_on_Register_with_us_button() throws Throwable {
		WebElement element=driver.findElement(By.xpath("//*[@id=\"p0widget\"]/div/div[1]/div/input"));
		element.click();
	    
	}

	@Then("^brewser should display next page$")
	public void brewser_should_display_next_page() throws Throwable {
		String actual=driver.findElement(By.xpath("//*[@id=\"flowBifurcation\"]/div[2]/form/div[1]/div/button")).getText();
		String expected="I am a Fresher";
		Assert.assertEquals(expected, actual);
		//driver.close();
	   
	}

	@When("^User clicks on 'I am a fresher' button$")
	public void user_clicks_on_I_am_a_fresher_button() throws Throwable {
		WebElement element=driver.findElement(By.xpath("//*[@id=\"flowBifurcation\"]/div[2]/form/div[1]/div/button"));
		element.click();
	   
	}

	@Then("^browser should display registration page of account$")
	public void browser_should_display_registration_page_of_account() throws Throwable {
		String actual=driver.findElement(By.xpath("//*[@id=\"banner\"]/ul/li[1]/div")).getText();
		String expected="Personal";
		Assert.assertEquals(expected, actual);
	   
	}

	@When("^User enter valid details$")
	public void user_enter_valid_details() throws Throwable {
		WebElement name=driver.findElement(By.id("fname"));
		name.sendKeys("Mary Jhon");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("mary@gmail.com");
	   WebElement password=driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/div[3]/div[1]/div/input"));
	   password.sendKeys("Jhonmary@123");
	   WebElement mobile=driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/div[4]/div[1]/div/input[2]"));
	   mobile.sendKeys("1231231231");
	   WebElement location=driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/resman-location/div/div/div[1]/div/div[1]/ul/li/div/label/input"));
	   location.sendKeys("Bangalore");
	   location.submit();
	}

	@Then("^browser should display the next page$")
	public void browser_should_display_the_next_page() throws Throwable {
		String actual=driver.findElement(By.xpath("//*[@id=\"banner\"]/ul/li[2]/div")).getText();
		String expected="Education";
		Assert.assertEquals(expected, actual);
	    
	}

	@When("^user enters valid educational details$")
	public void user_enters_valid_educational_details() throws Throwable {
	   
	}


}
