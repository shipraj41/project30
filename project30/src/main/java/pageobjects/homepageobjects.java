package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepageobjects {
	
	WebDriver driver;
	
	public homepageobjects(WebDriver driver)
	{
		this.driver = driver;

	}
	
	By signinoption = By.cssSelector("a[id='nav-link-accountList']");
	By signinbutton = By.xpath("//span[contains(text(),'Sign in') and @class='nav-action-inner']");
	By searchtextbox = By.cssSelector("input[id='twotabsearchtextbox']");
	
	public WebElement signinoptionhover()
	{
		return driver.findElement(signinoption);
	}
	
	public WebElement signinbuttonclick()
	{
		return driver.findElement(signinbutton);
	}
	
	public WebElement searchtextboxclick()
	{
		return driver.findElement(searchtextbox);
	}

}
