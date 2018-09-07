package com.cg.project.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.beans.Google;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearch {
	
	private WebDriver driver;
	
	private Google google;
	
	  public void setUpStepEnv()
	   {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    }

	@Given("^User is on Google home page$")
	public void user_is_on_Google_home_page() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		google=new Google();
		PageFactory.initElements(driver, google);
		

	}

	@When("^user search for 'Agile Methodology'$")
	public void user_search_for_Agile_Methodology() throws Throwable {
		
		google.setSearch("Agile Methodology");
		google.clickSignIn();
		
		/*WebElement searchElement=driver.findElement(By.id("lst-ib"));
		searchElement.sendKeys("Agile Methodology");
		searchElement.submit();*/

	}

	@Then("^all page links should be displayed for 'Agile Methodology'$")
	public void all_page_links_should_be_displayed_for_Agile_Methodology() throws Throwable {

		String actualTitle=driver.getTitle();
		String expectedTitle="Agile Methodology - Google Search";
		Assert.assertEquals(expectedTitle, actualTitle);
		//driver.close();
	}

}
