package com.cg.project.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedBus {

	@FindBy(how=How.ID,id="txtSource")
	private WebElement from;
	
	@FindBy(how=How.ID,id="txtDestination")
	private WebElement to;
	
	@FindBy(how=How.ID,id="txtOnwardCalendar")
	private WebElement onwardDate;

	@FindBy(className="search-btn searchBuses")
	private WebElement button;
	
	public String getFrom() {
		return from.getAttribute("value");
	}

	public void setFrom(String from) {
		this.from.sendKeys(from);
	}

	public String getTo() {
		return to.getAttribute("value");
	}

	public void setTo(String to) {
		this.to.sendKeys(to);
	}

	public String getOnwardDate() {
		return onwardDate.getAttribute("value");
	}

	public void setOnwardDate(String onwardDate) {
		this.onwardDate.sendKeys(onwardDate);
	}
	
	public void clickSignIn()
	{
		button.click();
	}
	
	
	
}
