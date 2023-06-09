package GWPC.PageObject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import GWPC.PageObject.Accountpagerepository;
import GWPC.PageObject.Loginpagerepository;

public class Logincreateaccountpolicy {

	@Test
	public void Login() throws InterruptedException
	{
		// Invoke the browser and open the link
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://pc-qa1-corecon.emc.dev-1.us-east-1.guidewire.net/PolicyCenter.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Enter the username & password and click on login button
		
		Loginpagerepository lpr = new Loginpagerepository(driver);
		lpr.username().sendKeys("su");
		lpr.password().sendKeys("gw");
		lpr.login().click();
		
		// Click on New Account option and Fill the field value on Enter Account Information screen 
		
		Accountpagerepository apr = new Accountpagerepository(driver);
		apr.accountoption().click();
		apr.newaccount().click();
		apr.companyname().sendKeys("EMCACCOUNT001");
		apr.searchbutton().click();
		Thread.sleep(2000);
		apr.createnewaccbutton().click();
		Thread.sleep(1000);
		apr.companyoption().click();
		Thread.sleep(1000);
		
		// Enter/Select the value on mandatory fields on New Account screen 
		
		apr.dateapplicationreceived().sendKeys("01/28/2024");
		apr.clearancedate().sendKeys("01/28/2024");
		apr.bppaccountname().sendKeys("EMCACCOUNT001");
		apr.address1().sendKeys("1101 Hennepin Ave");
		Thread.sleep(2000);
		apr.city().sendKeys("Minneapolis");
		Thread.sleep(2000);
		apr.city().sendKeys("Minneapolis");
		Thread.sleep(2000);
		apr.selectStateDropdown().click();
		Thread.sleep(2000);	
	
		apr.zipcode().sendKeys("55403-1705");
		Thread.sleep(1000);
		apr.verifyaddressbutton().click();
		Thread.sleep(2000);
		
		apr.fein().sendKeys("123456789");
		Thread.sleep(2000);
		apr.siccodesearchicon().click();
		Thread.sleep(4000);
		apr.siccodesearchicon().click();
		Thread.sleep(1000);
		apr.siccodeonsearch().sendKeys("1629");
		apr.sicsearchbutton().click();
		Thread.sleep(2000);
		apr.sicselectbutton().click();
		
		// Pending for NAISC Code
		apr.selectNAICSCodeDropdown().click();
//		Thread.sleep(5000);
		
		apr.organization().sendKeys("C0010");
		Thread.sleep(2000);
		apr.individualproducersearchicon().click();
		Thread.sleep(1000);
		apr.usernameonindusersearchscreen().sendKeys("c-00100065");
		Thread.sleep(1000);
		apr.searchbuttononInduser().click();
//		apr.selectbuttononInduser().click();
		apr.updatebutton().click();
		apr.returntocreateacclink().click();
		apr.updatebutton().click();
		Thread.sleep(1000);
		System.out.println("Account Number " + apr.accountnumbertext());
		System.out.println("Account Holder " + apr.accountholdertext());
		
	}
	
}
