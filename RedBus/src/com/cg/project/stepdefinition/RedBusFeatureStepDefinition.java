package com.cg.project.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RedBusFeatureStepDefinition {
	
	/*private WebDriver driver;
	
	@Given("^user is on redbus homepage$")
	public void user_is_on_redbus_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.redbus.in/bus-tickets/");
	    
	}

	@When("^user enters valid source and destination details$")
	public void user_enters_valid_source_and_destination_details() throws Throwable {
		
		WebElement from=driver.findElement(By.id("txtSource"));
		WebElement to=driver.findElement(By.id("txtDestination"));
		from.sendKeys("Bangalore");
		to.sendKeys("Nirmal");
		
		WebElement onwardDate=driver.findElement(By.id("txtOnwardCalendar"));
		WebElement returnDate=driver.findElement(By.id("txtReturnCalendar"));
		
		
		onwardDate.sendKeys("15-Aug-2018");
		returnDate.sendKeys("17-Aug-2018");
		WebElement search=driver.findElement(By.xpath("/html/body/div[1]/div[4]/button"));
       search.click();
       driver.get("https://www.redbus.in/search?");
		
	   
	}

	@Then("^browser should display the buses$")
	public void browser_should_display_the_buses() throws Throwable {
	   
		String actual=driver.getTitle();
		String expected="Search Bus Tickets";
		Assert.assertEquals(expected, actual);
		driver.close();
	}

*/
}
