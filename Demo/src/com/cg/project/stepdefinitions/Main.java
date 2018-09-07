package com.cg.project.stepdefinitions;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		//checkBoxTest();
		//radioBoxTest();
		selectTest();

	}
	
	private static void checkBoxTest() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\demo.html");
		WebElement checkbox=driver.findElement(By.id("mayoCheckbox"));
		Thread.sleep(1000);
		checkbox.click();
		if(checkbox.isSelected())
			System.out.println("Value of checkbox:"+checkbox.getAttribute("value"));
	}
	
	private static void radioBoxTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\demo.html");
		By elements=By.name("color");
		
		List<WebElement> radioButtons=driver.findElements(elements);
		
		WebElement radioBtn=radioButtons.get(1);
		
		radioBtn.click();
		
		for(WebElement radioButton:radioButtons)
		{
			if(radioButton.isSelected())
			{
				System.out.println(radioButton.getAttribute("value"));
			}
		}
	}
	
	private static void selectTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\select.html");
		WebElement selectElement=driver.findElement(By.id("select1"));
		Select select=new Select(selectElement);
		select.selectByVisibleText("Maybe");
		
	}
	
	
}
