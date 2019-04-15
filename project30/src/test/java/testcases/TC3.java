package testcases;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.homepageobjects;
import resources.base;

public class TC3 extends base{

	WebDriver driver;
	
	@BeforeTest
	public void openbrowser() throws IOException
	{
		driver = initializebrowser();
	}
	
	@Test
	public void textboxcapslockcheck() throws IOException, InterruptedException
	{
		driver.get(openwebsiteurl());
		homepageobjects hpo = new homepageobjects(driver);
		hpo.searchtextboxclick().sendKeys(Keys.SHIFT,"laptop");
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void closedriver()
	{
		driver.close();
		driver = null;
	}
}
