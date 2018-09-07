package com.cg.registration.beans;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/*
 * class name: Educational Details
 * date of creation:24-08-2018
 * @author npannala
 */
public class EducationalDetails {

	@FindBy(name="graduation")
	public List<WebElement> graduation;
	
	@FindBy(how=How.NAME, name="percentage")
	private WebElement percentage;
	
	@FindBy(how=How.NAME, name="passingYear")
	private WebElement passingYear;
	
	@FindBy(how=How.NAME, name="projectName")
	private WebElement projectName;
	
	
	
	@FindBy(how=How.NAME, name="otherTechnologies")
	private WebElement otherTechnology;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\"btnRegister\"]")
	private WebElement submit;
	
	
	public void setGraduation(String graduation) {
		Select select = new Select(this.graduation.get(0));
	    select.selectByVisibleText(graduation);
	}
	
	public void setPercentage(String percentage) {
		this.percentage.sendKeys(percentage);
	}
	public void setPassingYear(String passingYear) {
		this.passingYear.sendKeys(passingYear);
	}
	public void setProjectName(String projectName) {
		this.projectName.sendKeys(projectName);
	}
	public void setTechnologiesUsed(String technologiesUsed) {
		technology(technologiesUsed);
		
	}
	public void setOtherTechnology(String otherTechnology) {
		this.otherTechnology.sendKeys(otherTechnology);
	}
	
	public void clickRegister()
	{
		submit.click();
	}
	
	
	
	@FindBy(how=How.CSS,css="input[value='.Net']")
	private WebElement tchNet;
	@FindBy(how=How.CSS,css="input[value='Java']")
	private WebElement techJava;
	@FindBy(how=How.CSS,css="input[value='PHP']")
	private WebElement techPhp;
	@FindBy(how=How.CSS,css="input[value='Other']")
	private WebElement techOther;
	
	public void technology(String technology)
	{
		if(technology==".Net")
		{
			this.tchNet.click();
		}
		else if(technology=="Java")
		{
			
				this.techJava.click();
		}
		else if(technology=="PHP")
		{
			this.techPhp.click();
		}
		else
		{
			this.techOther.click();
		}
	}
}
