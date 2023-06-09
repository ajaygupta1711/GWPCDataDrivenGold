package GWBCBatchPayment;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class GWBCDDBatchPayment {

		public static void main(String[] args) throws IOException, InterruptedException {
			
			// Invoke the browser and open the link
			
//			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://bc-sit2-corecon.emc.dev-1.us-east-1.guidewire.net/PolicyCenter.do");
			
			// Explicit wait to find/click on Explicit Wait
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			
			// Maximize the browser window and wait for populating all web elements
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7000));
			
			// Create the object of excel driven class
			
			DataGWBC d = new DataGWBC();
			ArrayList <String> data = d.getData("Login");
			
			// Enter the username & password and click on Login button
			
			driver.findElement(By.name("Login-LoginScreen-LoginDV-username")).sendKeys(data.get(1));
			driver.findElement(By.name("Login-LoginScreen-LoginDV-password")).sendKeys(data.get(2));
			driver.findElement(By.id("Login-LoginScreen-LoginDV-submit")).click();
			Thread.sleep(2000);
			
// Batch Payment Entry	
			
			// Click on Action > New Payment > Batch Payment Entry
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("DesktopGroup-DesktopMenuActions"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='DesktopGroup-DesktopMenuActions-DesktopMenuActions_NewPayment']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='DesktopGroup-DesktopMenuActions-DesktopMenuActions_NewPayment']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Batch Payment Entry')]"))).click();
			
			// Select/Enter the fields value on 'Multiple Payment Entry Wizard' screen
			
			WebElement selectSourceDropdown = driver.findElement(By.name("BatchPaymentEntryWizard-NewBatchPaymentScreen-Source_Ext"));
			Select dropdown = new Select(selectSourceDropdown);
			Thread.sleep(2000);
			dropdown.selectByVisibleText(data.get(3));
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("BatchPaymentEntryWizard-NewBatchPaymentScreen-BatchAmount"))).sendKeys(data.get(4));
			
			WebElement selectTypeDropdown = driver.findElement(By.name("BatchPaymentEntryWizard-NewBatchPaymentScreen-NewMultiPaymentLV-0-PaymentType"));
			Select dropdown1 = new Select(selectTypeDropdown);
			Thread.sleep(2000);
			dropdown1.selectByVisibleText(data.get(5));
			
			driver.findElement(By.name("BatchPaymentEntryWizard-NewBatchPaymentScreen-NewMultiPaymentLV-0-Account")).sendKeys(data.get(6));
//			driver.findElement(By.name("BatchPaymentEntryWizard-NewBatchPaymentScreen-NewMultiPaymentLV-0-Invoice")).sendKeys(data.get(7));
//			driver.findElement(By.name("BatchPaymentEntryWizard-NewBatchPaymentScreen-NewMultiPaymentLV-0-Producer")).sendKeys(data.get(8));
//			driver.findElement(By.name("BatchPaymentEntryWizard-NewBatchPaymentScreen-NewMultiPaymentLV-0-StatementInvoice_Ext")).sendKeys(data.get(9));
//			driver.findElement(By.name("BatchPaymentEntryWizard-NewBatchPaymentScreen-NewMultiPaymentLV-0-DBCommissions_Ext")).click();
			driver.findElement(By.name("BatchPaymentEntryWizard-NewBatchPaymentScreen-NewMultiPaymentLV-0-Amount")).clear();
			driver.findElement(By.name("BatchPaymentEntryWizard-NewBatchPaymentScreen-NewMultiPaymentLV-0-Amount")).sendKeys(data.get(11));
			driver.findElement(By.name("BatchPaymentEntryWizard-NewBatchPaymentScreen-NewMultiPaymentLV-0-RefNumber")).sendKeys(data.get(12));
			driver.findElement(By.name("BatchPaymentEntryWizard-NewBatchPaymentScreen-NewMultiPaymentLV-0-Description")).sendKeys(data.get(13));
			
			WebElement selectPIDropdown = driver.findElement(By.name("BatchPaymentEntryWizard-NewBatchPaymentScreen-NewMultiPaymentLV-0-paymentinstrument"));
			Select dropdown3 = new Select(selectPIDropdown);
			Thread.sleep(2000);
			dropdown3.selectByVisibleText("Check");
			
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Next')]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Post Batch')]"))).click();
			
			
//			driver.findElement(By.xpath("//div[contains(text(), 'Post Batch')]")).click();
			
			// Run the 'Post Surepath Batch Job'

/*			Actions a = new Actions(driver);
			a.getActiveKeyboard();
			a.keyDown(Keys.ALT).keyDown(Keys.SHIFT).sendKeys("T");
			*/
			
		} 
}