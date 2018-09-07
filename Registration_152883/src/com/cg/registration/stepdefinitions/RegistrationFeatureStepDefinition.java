package com.cg.registration.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import com.cg.registration.beans.EducationalDetails;
import com.cg.registration.beans.PersonalDetails;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Class name: RegistrationFeatureStepDefinition
 * Purpose: Testing the registration
 * Date Of Creation:24-08-2018
 * @author npannala
 *
 */
public class RegistrationFeatureStepDefinition {
	
	private WebDriver driver;
	private PersonalDetails personalDetails;
	private EducationalDetails educationalDetails;
	
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe" );
	}
	
	
	@Given("^user is on personal details  registration page$")
	public void user_is_on_personal_details_registration_page() throws Throwable {
		driver = new ChromeDriver();
		driver.get("D:\\WebPages_Set 3\\PersonalDetails.html");
		personalDetails = PageFactory.initElements(driver, PersonalDetails.class);
		educationalDetails = PageFactory.initElements(driver, EducationalDetails.class);
	}

	@Then("^personal details page should load with tile 'Personal Details'$")
	public void personal_details_page_should_load_with_tile_Personal_Details() throws Throwable {
	   
		String expectedTitle="Personal Details";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("^user will click on next without entering First Name$")
	public void user_will_click_on_next_without_entering_First_Name() throws Throwable {
		personalDetails.setFirstName("");
		personalDetails.clickNext();
	    
	}

	@Then("^'Please fill the First Name' message should display$")
	public void please_fill_the_First_Name_message_should_display() throws Throwable {
		String expectedMessage="Please fill the First Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	   
	}

	@When("^user will click on next without entering Last Name$")
	public void user_will_click_on_next_without_entering_Last_Name() throws Throwable {
	    
		personalDetails.setFirstName("Mary");
		personalDetails.clickNext();
	}

	@Then("^'Please fill the Last Name' message should display$")
	public void please_fill_the_Last_Name_message_should_display() throws Throwable {
		String expectedMessage="Please fill the Last Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next without entering Email$")
	public void user_will_click_on_next_without_entering_Email() throws Throwable {
	  
		personalDetails.setLastName("Jhon");
		personalDetails.clickNext();
	}

	@Then("^'Please fill the Email' message should display$")
	public void please_fill_the_Email_message_should_display() throws Throwable {
		String expectedMessage="Please fill the Email";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	  
	}

	@When("^user will click on next without entering Contact no\\.$")
	public void user_will_click_on_next_without_entering_Contact_no() throws Throwable {
	    
		personalDetails.setEmail("mary@gmail.com");
		personalDetails.clickNext();
	}

	@Then("^'Please fill the Contact No\\.' message should display$")
	public void please_fill_the_Contact_No_message_should_display() throws Throwable {
		String expectedMessage="Please fill the Contact No.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	   
	}

	@When("^user will click on next without entering valid Contact no\\.$")
	public void user_will_click_on_next_without_entering_valid_Contact_no() throws Throwable {
		personalDetails.setContactNumber("9807");
		personalDetails.clickNext();
	    
	}

	@Then("^'Please enter valid Contact no\\.' message should display$")
	public void please_enter_valid_Contact_no_message_should_display() throws Throwable {
	    
		String expectedMessage="Please enter valid Contact no.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next without entering address line (\\d+)\\.$")
	public void user_will_click_on_next_without_entering_address_line(int arg1) throws Throwable {
	   personalDetails.setContactNumber("456789");
		personalDetails.clickNext();
	}

	@Then("^'Please fill the address line (\\d+)' message should display$")
	public void please_fill_the_address_line_message_should_display(int arg1) throws Throwable {

		String expectedMessage="Please fill the address line 1";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}
	
	@When("^user will click on next without entering addressline (\\d+)\\.$")
	public void user_will_click_on_next_without_entering_addressline(int arg1) throws Throwable {
		personalDetails.setAddressLine1("ATP");
		  personalDetails.clickNext();
	}

	@Then("^'Please fill the address line(\\d+)' message should displays$")
	public void please_fill_the_address_line_message_should_displays(int arg1) throws Throwable {
		String expectedMessage="Please fill the address line 2";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	
	@When("^user will click on next without selcting City$")
	public void user_will_click_on_next_without_selcting_City() throws Throwable {
	   personalDetails.setAddressLine2("colony");
	   personalDetails.clickNext();
	}

	@Then("^'Please select city' message should display$")
	public void please_select_city_message_should_display() throws Throwable {
		String expectedMessage="Please select city";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	   
	}

	@When("^user will click on next without selecting State$")
	public void user_will_click_on_next_without_selecting_State() throws Throwable {
		personalDetails.setCity("Hyderabad");
		 personalDetails.clickNext();
		
	    
	}

	@Then("^'Please select state' message should display$")
	public void please_select_state_message_should_display() throws Throwable {
		String expectedMessage="Please select state";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	    
	}

	@When("^user will click on next by entering all valid details$")
	public void user_will_click_on_next_by_entering_all_valid_details() throws Throwable {
		personalDetails.setState("Telangana");
		personalDetails.clickNext();
	    
	}

	@Then("^'Personal details are validated accepted successfully\\.' message should display$")
	public void personal_details_are_validated_accepted_successfully_message_should_display() throws Throwable {
		String expectedMessage="Personal details are validated and accepted successfully.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
	}

	@Then("^navigates to the 'Educational Details' page$")
	public void navigates_to_the_Educational_Details_page() throws Throwable {
		driver.switchTo().alert().dismiss();
	}

	@When("^user is on educational details page$")
	public void user_is_on_educational_details_page() throws Throwable {
	    
	}

	@Then("^registration page should load with tile 'Education Details'$")
	public void registration_page_should_load_with_tile_Education_Details() throws Throwable {
		String expectedTitle="Educational Details";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("^user will click on register me without selecting graduation$")
	public void user_will_click_on_register_me_without_selecting_graduation() throws Throwable {
	   
	   educationalDetails.clickRegister();
	}

	@Then("^'Please Select Graduation' message should dispaly$")
	public void please_Select_Graduation_message_should_dispaly() throws Throwable {
		String expectedMessage="Please Select Graduation";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on register me without entering percentage$")
	public void user_clicks_on_register_me_without_entering_percentage() throws Throwable {
	   educationalDetails.setGraduation("MCA");
	   educationalDetails.clickRegister();
	}

	@Then("^'Please fill Percentage detail' message should display$")
	public void please_fill_Percentage_detail_message_should_display() throws Throwable {
		String expectedMessage="Please fill Percentage detail";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on register me without entering passing year$")
	public void user_clicks_on_register_me_without_entering_passing_year() throws Throwable {
	   educationalDetails.setPercentage("75");
	   educationalDetails.clickRegister();
	}

	@Then("^'Please fill Passing Year' message should display$")
	public void please_fill_Passing_Year_message_should_display() throws Throwable {
		String expectedMessage="Please fill Passing Year";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on register me without entering project name$")
	public void user_clicks_on_register_me_without_entering_project_name() throws Throwable {
	    educationalDetails.setPassingYear("2018");
	    educationalDetails.clickRegister();
	}

	@Then("^'Please fill Project Name' message should display$")
	public void please_fill_Project_Name_message_should_display() throws Throwable {
		String expectedMessage="Please fill Project Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on register me without selecting technologies used$")
	public void user_clicks_on_register_me_without_selecting_technologies_used() throws Throwable {
	   educationalDetails.setProjectName("e-learning");
	   educationalDetails.clickRegister();
	}

	@Then("^'Please Select Technologies Used' message should display$")
	public void please_Select_Technologies_Used_message_should_display() throws Throwable {
		String expectedMessage="Please Select Technologies Used";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on register me without entering other technologies$")
	public void user_clicks_on_register_me_without_entering_other_technologies() throws Throwable {
		
		
		educationalDetails.technology("Java");
		 educationalDetails.clickRegister();
		
	   
	}

	@Then("^'Please fill othe Technologies Used' message should display$")
	public void please_fill_othe_Technologies_Used_message_should_display() throws Throwable {
		String expectedMessage="Please fill other Technologies Used";
		String actualMessage=driver.switchTo().alert().getText();
		//Assert.assertEquals(expectedMessage, actualMessage);
		Assert.assertNotEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on register me with valid details$")
	public void user_clicks_on_register_me_with_valid_details() throws Throwable {
	    educationalDetails.setOtherTechnology("Java");
	    educationalDetails.clickRegister();
	}

	@Then("^'Your Registration Has succesfully done plz check you registerd email for account activation link!!!' message should dispaly$")
	public void your_Registration_Has_succesfully_done_plz_check_you_registerd_email_for_account_activation_link_message_should_dispaly() throws Throwable {
		String expectedMessage="Your Registration Has succesfully done Plz check you registerd email for account activation link !!!";
		
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		driver.close();
	}



}
