package com.cg.project.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.beans.Login;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginFeature {
	
	  private WebDriver driver;
	  
	  private Login login;
	
	 public void setUpStepEnv()
	    {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    }	
		


    @Given("^User is on home page$")
    public void user_is_on_home_page() throws Throwable {
	
	driver=new ChromeDriver();
	driver.get("file:///D:/WebBDD/login.html");
	login=new Login();
	PageFactory.initElements(driver, login);
    
   
    }
    
    @When("^user click on login without username$")
   public void user_click_on_login_without_username() throws Throwable {
    
    	login.setUname("");
    	login.clickSignIn();
   }

   @Then("^browser should dispaly 'enter username' message$")
    public void browser_should_dispaly_enter_username_message() throws Throwable {
    
	   
	   String expected="Enter username";
		String actual=driver.switchTo().alert().getText();
		Assert.assertEquals(expected,actual);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
   }

    @When("^user click on login without password$")
    public void user_click_on_login_without_password() throws Throwable {
    
    	
    	login.setUname("admin");
    	login.setPassword("");
    	login.clickSignIn();
   }

     @Then("^browser should dispaly 'enter password' message$")
     public void browser_should_dispaly_enter_password_message() throws Throwable {
    
    	 String expected="Enter password";
    		String actual=driver.switchTo().alert().getText();
    		Assert.assertEquals(expected,actual);
    }



    @When("^user enters valid username and password$")
    public void user_enters_valid_username_and_password() throws Throwable {
    
	login.setUname("admin");
	   login.setPassword("admin");
	   login.clickSignIn();
   }

   @Then("^browser should display 'Login success'$")
   public void browser_should_display_Login_success() throws Throwable {
   
	String expected="Login success";
	String actual=driver.switchTo().alert().getText();
	Assert.assertEquals(expected,actual);
			
  }

  @When("^user enters invalid username and password$")
  public void user_enters_invalid_username_and_password() throws Throwable {
	login.setUname("umin");
	   login.setPassword("min");
	   login.clickSignIn();
  }

  @Then("^browser should display 'Login failure'$")
  public void browser_should_display_Login_failure() throws Throwable {
	  String expected="Login failure";
	  TargetLocator locator=driver.switchTo();
	  Alert alert=locator.alert();
	  String actual=alert.getText();
		Assert.assertEquals(expected,actual);
   
  }


 }
