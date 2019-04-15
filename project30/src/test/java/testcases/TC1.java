package testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class TC1 extends base{

	WebDriver driver;
	public static Logger log = LogManager.getLogger(TC1.class.getName());
	
	@BeforeTest
	public void openbrowser() throws IOException
	{
		log.debug("initializing browser");
		driver = initializebrowser();
		log.info("browser is opened successfully");
	}
	
	@Test
	public void openurl() throws IOException
	{
		log.debug("opening website");
		driver.get(openwebsiteurl());
		log.info("website opened successfully");
		String text = driver.findElement(By.xpath("//h2[contains(text(),'Affordable finds')]")).getText();
		Assert.assertTrue(text.contains("shipra"));
	}
	
	@AfterTest
	public void closedriver()
	{
		driver.close();
		driver = null;
	}
}
