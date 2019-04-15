package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.homepageobjects;
import pageobjects.signinpageobjects;
import resources.base;

public class TC4 extends base{

	WebDriver driver;
	
	@Test(dataProvider = "getdata")
	public void signincheck(String username , String password) throws IOException
	{
		driver = initializebrowser();
		driver.get(openwebsiteurl());
		homepageobjects hpo = new homepageobjects(driver);
		Actions act = new Actions(driver);
		act.moveToElement(hpo.signinoptionhover()).moveToElement(hpo.signinbuttonclick()).click().build().perform();
		
		signinpageobjects spo = new signinpageobjects(driver);
		spo.enterusername().sendKeys(username);
		spo.enterpassword().sendKeys(password);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0] = "shipra";
		data[0][1] = "11111";
		
		data[1][0] = "Aditya";
		data[1][1] = "55555";
		
		return data;
	}
	
}
