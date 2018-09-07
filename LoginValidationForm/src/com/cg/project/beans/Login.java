package com.cg.project.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {
	
	@FindBy(how=How.ID,id="username")
	private WebElement uname;
	
	@FindBy(how=How.ID,id="password")
	private WebElement password;
	
	@FindBy(how=How.ID,id="submit")
	private WebElement button;
	
	@FindBy(how=How.ID,id="head")
	private WebElement actualErrorMessage;

	public String getUname() {
		return uname.getAttribute("value");
	}

	public void setUname(String uname) {
		this.uname.sendKeys(uname);
	}

	public String getPassword() {
		return password.getAttribute("value");
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void clickSignIn()
	{
		button.click();
	}
	
	public String getActual()
	{
		return actualErrorMessage.getText();
	}

}
