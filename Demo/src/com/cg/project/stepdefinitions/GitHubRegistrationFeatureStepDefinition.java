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

public class GitHubRegistrationFeatureStepDefinition {
	/*private WebDriver driver;
	
	@Given("^user is on GitHub page$")
	public void user_is_on_GitHub_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://github.com/join?source=header-home");
	   
	}

	@When("^user enters valid details$")
	public void user_enters_valid_details() throws Throwable {
		WebElement usernameElement=driver.findElement(By.id("user_login"));
		WebElement password=driver.findElement(By.id("user_password"));
		WebElement email=driver.findElement(By.id("user_email"));
		usernameElement.sendKeys("Junnu12343214");
		email.sendKeys("junnu5656@gmail.com");
		password.sendKeys("ju123nnu78956");
		password.submit();
	   
	}

	@Then("^browser must display 'Welcome to Github'$")
	public void browser_must_display_Welcome_to_Github() throws Throwable {
		
		String actual=driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[1]/h1")).getText();
		String expected="Welcome to GitHub";
		Assert.assertEquals(expected, actual);
		driver.close();
	    
	}

	@When("^user enters invalid username$")
	public void user_enters_invalid_username() throws Throwable {
		WebElement usernameElement=driver.findElement(By.id("user_login"));
		WebElement password=driver.findElement(By.id("user_password"));
		WebElement email=driver.findElement(By.id("user_email"));
		usernameElement.sendKeys("abc");
		email.sendKeys("kklliimm@gmail.com");
		password.sendKeys("kkllmmii123");
		password.submit();
	   
	   
	}

	@Then("^browser should display 'Username  is already taken'$")
	public void browser_should_display_Username_is_already_taken() throws Throwable {
		
		String actual=driver.findElement(By.xpath("//*[@id=\"signup-form\"]/auto-check[1]/dl/dd[2]")).getText();
		String expected="Login is already taken";
		Assert.assertEquals(expected, actual);
		driver.close();
	    
	}

	@When("^user enters invalid password$")
	public void user_enters_invalid_password() throws Throwable {
		WebElement usernameElement=driver.findElement(By.id("user_login"));
		WebElement password=driver.findElement(By.id("user_password"));
		WebElement email=driver.findElement(By.id("user_email"));
		usernameElement.sendKeys("eeffefeff");
		email.sendKeys("eeffefef@gmail.com");
		password.sendKeys("kk");
		password.submit();
	   
	    
	}

	@Then("^browser should display 'password is short'$")
	public void browser_should_display_password_is_short() throws Throwable {
		String actual=driver.findElement(By.xpath("//*[@id=\"signup-form\"]/dl/dd[2]")).getText();
		String expected="Password is too short (minimum is 7 characters), needs at least one number, and has been compromised in a third party data breach";
		Assert.assertEquals(expected, actual);
		driver.close();
	    
	}

	@When("^user enters invalid EmailId$")
	public void user_enters_invalid_EmailId() throws Throwable {
		WebElement usernameElement=driver.findElement(By.id("user_login"));
		WebElement password=driver.findElement(By.id("user_password"));
		WebElement email=driver.findElement(By.id("user_email"));
		usernameElement.sendKeys("rrtthhjjll");
		email.sendKeys("junn");
		password.sendKeys("rrtthhkkll");
		password.submit();
	   
	    
	}

	@Then("^browser should display 'Email is invalid'$")
	public void browser_should_display_Email_is_invalid() throws Throwable {
		String actual=driver.findElement(By.xpath("//*[@id=\"signup-form\"]/auto-check[2]/dl/dd[2]")).getText();
		String expected="Email is invalid or already taken";
		Assert.assertEquals(expected, actual);
		driver.close();
	   
	}

*/

}
