package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinpageobjects {

	WebDriver driver;
	
	public signinpageobjects(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[id='ap_email']")
	WebElement usernametextbox;
	
	@FindBy(css="input[id='ap_password']")
	WebElement passwordtextbox;
	
	public WebElement enterusername()
	{
		return usernametextbox;
	}
	
	public WebElement enterpassword()
	{
		return passwordtextbox;
	}
}
