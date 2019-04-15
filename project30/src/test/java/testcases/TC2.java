package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.homepageobjects;
import resources.base;

public class TC2 extends base{

	WebDriver driver;
	
	@BeforeTest
	public void openbrowser() throws IOException
	{
		driver = initializebrowser();
	}
	
	@Test
	public void signincheck() throws IOException
	{
		driver.get(openwebsiteurl());
		
		homepageobjects hpo = new homepageobjects(driver);
		Actions act = new Actions(driver);
		act.moveToElement(hpo.signinoptionhover()).build().perform();
		act.moveToElement(hpo.signinbuttonclick()).click().build().perform();	
		
	}
	
	@AfterTest
	public void closedriver()
	{
		driver.close();
		driver=null;
	}
	
}