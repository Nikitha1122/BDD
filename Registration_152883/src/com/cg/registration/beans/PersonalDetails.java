package com.cg.registration.beans;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/**
 * class name: Personal Details
 * date of creation:24-08-2018
 * @author npannala
 *
 */
public class PersonalDetails {

	@FindBy(how=How.NAME, name="txtFN")
	private WebElement firstName;
	
	@FindBy(how=How.NAME, name="txtLN")
	private WebElement lastName;
	
	@FindBy(how=How.NAME, name="Email")
	private WebElement email;
	
	@FindBy(how=How.NAME, name="Phone")
	private WebElement ContactNumber;
	
	@FindBy(how=How.NAME, name="address1")
	private WebElement addressLine1;
	
	@FindBy(how=How.NAME, name="address2")
	private WebElement addressLine2;
	
	@FindBy(name="city")
	public List<WebElement> city;
	
	@FindBy(name="state")
	public List<WebElement> state;
	
	@FindBy(how=How.XPATH, xpath="/html/body/form/table/tbody/tr[11]/td/a")
	public WebElement next;
	
	
	
	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	
	public void setContactNumber(String contactNumber) {
		this.ContactNumber.sendKeys(contactNumber);
	}
	
	public void setAddressLine1(String addressLine1) {
		this.addressLine1.sendKeys(addressLine1);
	}
	
	public void setAddressLine2(String addressLine2) {
		this.addressLine2.sendKeys(addressLine2);
	}
	
	public void setCity(String city) {
		Select select = new Select(this.city.get(0));
	    select.selectByVisibleText(city);
	}
	
	public void setState(String state) {
		Select select = new Select(this.state.get(0));
	    select.selectByVisibleText(state);
	}
	
	/**
	 * name: clickNext
	 * purpose:button clicks
	 */
	public void clickNext() {
		 next.click();
	}
}
