package com.cg.project.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Amazon {
	
	@FindBy(how=How.ID,id="twotabsearchtextbox")
	private WebElement name;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"nav-search\"]/form/div[2]/div/input")
	private WebElement button;

	public String getName() {
		return name.getAttribute("value");
	}

	public void setName(String name) {
		this.name.sendKeys(name);
	}
	
	public void clickSignIn()
	{
		button.submit();
	}
	

	
}
