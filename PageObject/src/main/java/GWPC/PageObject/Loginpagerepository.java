package GWPC.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagerepository {

	WebDriver driver;
	
	public Loginpagerepository(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// GWPC Login page
	
	@FindBy(name="Login-LoginScreen-LoginDV-username") WebElement username;
	@FindBy(name="Login-LoginScreen-LoginDV-password") WebElement password;
	@FindBy (id="Login-LoginScreen-LoginDV-submit") WebElement login;
	
	public WebElement username()
	{
		return username;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement login()
	{
		return login;
	}
	
}
