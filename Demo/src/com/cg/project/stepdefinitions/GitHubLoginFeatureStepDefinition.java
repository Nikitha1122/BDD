package com.cg.project.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cg.project.beans.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GitHubLoginFeatureStepDefinition {
	
	private WebDriver driver;
	
	private LoginPage loginpage;
	
	@Before(order=1)
	public void setUpStepEnv()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	}
	
	@Given("^User is on GitHub account$")
	public void user_is_on_GitHub_account() throws Throwable {
		driver=new ChromeDriver();
		driver.get("https://github.com/login");
		loginpage=new LoginPage();
		PageFactory.initElements(driver, loginpage);
		
		
		/*System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://github.com/login");*/
	    
	}

	@When("^User enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable {
		
		loginpage.setUsername("adhikary96");
		loginpage.setPassword("Chemistry@123");
		loginpage.clickSignIn();;
		
		/*WebElement usernameElement=driver.findElement(By.id("login_field"));
		WebElement password=driver.findElement(By.id("password"));
		usernameElement.sendKeys("Nikitha1122");
		password.sendKeys("nikki12345");
		password.submit();*/
	   
	}

	@Then("^browser will display login success$")
	public void browser_will_display_login_success() throws Throwable {
		
		String actual=driver.getTitle();
		String expected="GitHub";
		Assert.assertEquals(expected, actual);
		
		
		
		
		
	/*	WebDriverWait driverwait=new WebDriverWait(driver, 10);
		driverwait.until(ExpectedConditions.
				textToBe(By.xpath("//*[@id=\"user-links\"]/li[3]/details/details-menu/ul/li[1]/a/strong"), "Nikitha1122"));
		
		String actual=driver.findElement(By.xpath("//*[@id=\"user-links\"]/li[3]/details/details-menu/ul/li[1]/a/strong")).getText();
		String expected="Nikitha1122";
		Assert.assertEquals(expected, actual);
		driver.close();*/
	    
	}

	@When("^User enters invalid username and password$")
	public void user_enters_invalid_username_and_password() throws Throwable {
		
		loginpage.setUsername("Tina");
		loginpage.setPassword("Tina@");
		loginpage.clickSignIn();
		
		/*WebElement usernameElement=driver.findElement(By.id("login_field"));
		WebElement password=driver.findElement(By.id("password"));
		usernameElement.sendKeys("sdfg34");
		password.sendKeys("tghhjk");
		password.submit();*/
	    
	}

	@Then("^browser will display login failure$")
	public void browser_will_display_login_failure() throws Throwable {
		
		String expected="Incorrect username or password.";
		Assert.assertEquals(expected, loginpage.getActual());
		
		
		/*String actual=driver.findElement(By.xpath("//*[@id='js-flash-container']/div")).getText();
		String expected="Incorrect username or password.";
		Assert.assertEquals(expected, actual);
		driver.close();
	   */
	}



}
