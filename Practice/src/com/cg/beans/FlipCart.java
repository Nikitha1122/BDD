package com.cg.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlipCart {
	
	@FindBy(how=How.NAME,name="q")
	private WebElement name;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/form/div/div[2]/button")
	private WebElement button;
	
	@FindBy(how=How.XPATH,xpath="/html/body/div[2]/div/div/button")
	private WebElement pop;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"container\"]/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/span/span")
	private WebElement actualErrorMessage;

	public String getName() {
		return name.getAttribute("value");
	}

	public void setName(String name) {
		this.name.sendKeys(name);
	}

	public void clickSignIn()
	{
		button.click();
	}
	
	public void popUp()
	{
		pop.click();
	}
	
	public String getActual()
	{
		return actualErrorMessage.getText();
	}
	

}
