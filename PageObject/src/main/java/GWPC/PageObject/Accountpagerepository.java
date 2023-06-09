package GWPC.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Accountpagerepository {

	WebDriver driver;
	
	public Accountpagerepository(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Click on New Account option and Fill the field value on Enter Account Information screen  
	
	@FindBy(css="div[id='TabBar-AccountTab'] div[class='gw-icon gw-icon--expand']") WebElement accountoption;
	
	public WebElement accountoption()
	{
		return accountoption;
	}
	
	@FindBy(xpath="//div[@id='TabBar-AccountTab-AccountTab_NewAccount']//div[text()='New Account']") WebElement newaccount;
	
	public WebElement newaccount()
	{
		return newaccount;
	}
	
	@FindBy(name="NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalContactNameInputSet-Name") WebElement companyname;
	
	public WebElement companyname()
	{
		return companyname;
	}
	
	@FindBy(id="NewAccount-NewAccountScreen-NewAccountSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search") WebElement searchbutton;
	
	public WebElement searchbutton()
	{
		return searchbutton;
	}
	
	@FindBy(xpath="//div[@id='NewAccount-NewAccountScreen-NewAccountButton']//div[text()='te New Account']") WebElement createnewaccbutton;
	
	public WebElement createnewaccbutton()
	{
		return createnewaccbutton;
	}
	
	@FindBy(xpath="//div[@id='NewAccount-NewAccountScreen-NewAccountButton-NewAccount_Company']//div[text()='Company']") WebElement companyoption;
	
	public WebElement companyoption()
	{
		return companyoption;
	}
	
	// Enter/Select the value on mandatory fields on New Account screen 
	
	@FindBy(name="CreateAccount-CreateAccountScreen-CreateAccountDV-ApplicationReceivedDate_Ext") WebElement dateapplicationreceived;
	
	public WebElement dateapplicationreceived()
	{
		return dateapplicationreceived;
	}
	
	@FindBy(name="CreateAccount-CreateAccountScreen-CreateAccountDV-ClearanceDate_Ext") WebElement clearancedate;
	
	public WebElement clearancedate()
	{
		return clearancedate;
	}
	
	@FindBy(name="CreateAccount-CreateAccountScreen-CreateAccountDV-Nickname") WebElement bppaccountname;
	
	public WebElement bppaccountname()
	{
		return bppaccountname;
	}
	
	@FindBy(name="CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1") WebElement address1;
	
	public WebElement address1()
	{
		return address1;
	}
	
	@FindBy(xpath="//div[@id='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']//input[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']") WebElement city;
	
	public WebElement city()
	{
		return city;
	}
	
	@FindBy(css="[class='gw-vw--value'] [name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']") WebElement stateselectionicon;
	
	public WebElement stateselectionicon()
	{
		return stateselectionicon;
	}
	
@FindBy(xpath="[//div[@class='gw-vw--value']/select[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']") WebElement stateselectionicon1;
	
	public WebElement stateselectionicon1()
	{
		return stateselectionicon1;
	}
	
	@FindBy(css="select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']") WebElement selectStateDropdown;

	public WebElement selectStateDropdown()
	{
		Select dropdown = new Select(selectStateDropdown);
		dropdown.selectByVisibleText("Minnesota");
		return selectStateDropdown;
	}	
	
	@FindBy(css="select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']") WebElement selectStateDropdown1;	

	public WebElement selectStateDropdown1() throws InterruptedException
	{
		Select dropdown = new Select(selectStateDropdown1);
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Minnesota");
		return selectStateDropdown1;
	}
	
	@FindBy(name="CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode") WebElement zipcode;
	
	public WebElement zipcode()
	{
		return zipcode;
	}
	
	@FindBy(xpath="//div[contains(text(), 'Verify Address')]") WebElement verifyaddressbutton;
	
	public WebElement verifyaddressbutton()
	{
		return verifyaddressbutton;
	}
	
	@FindBy(name="CreateAccount-CreateAccountScreen-CreateAccountDV-OfficialIDInputSet-OfficialIDDV_Input") WebElement fein;
	
	public WebElement fein()
	{
		return fein;
	}
	
	@FindBy(xpath="//*[@id=\"CreateAccount-CreateAccountScreen-CreateAccountDV-IndustryCode-SelectIndustryCode\"]/span") WebElement siccodesearchicon;
	
	public WebElement siccodesearchicon()
	{
		return siccodesearchicon;
	}
	
	@FindBy(name="IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchDV-Code") WebElement siccodeonsearch;
	
	public WebElement siccodeonsearch()
	{
		return siccodeonsearch;
	}
	
	@FindBy(id="IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search") WebElement sicsearchbutton;

	public WebElement sicsearchbutton()
	{
		return sicsearchbutton;
	}
	
	@FindBy(xpath="//div[contains(text(), 'Select')]") WebElement sicselectbutton;
	
	public WebElement sicselectbutton()
	{
		return sicselectbutton;
	}
	
	@FindBy(name="CreateAccount-CreateAccountScreen-CreateAccountDV-NAICSCode_Ext") WebElement selectNAICSCodeDropdown;
	
	public WebElement selectNAICSCodeDropdown()
	{
		Select dropdown1 = new Select(selectNAICSCodeDropdown);
		dropdown1.selectByVisibleText("236210 - Industrial Building Construction");
		return selectNAICSCodeDropdown;
	}
		
	@FindBy(css="input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-ProducerSelectionInputSet-Producer']") WebElement organization;
	
	public WebElement organization()
	{
		return organization;
	}
	
	@FindBy(css="*[id='CreateAccount-CreateAccountScreen-CreateAccountDV-ProducerSelectionInputSet-Producer-SelectOrganization'] span") WebElement individualproducersearchicon;
	
	public WebElement individualproducersearchicon()
	{
		return individualproducersearchicon;
	}
	
	@FindBy(xpath="//*[@id='CreateAccount-CreateAccountScreen-CreateAccountDV-ProducerSelectionInputSet-IndividualProducer_Ext-SelectIndividualProducer_Ext']/span") WebElement individualproducersearchicon1;
	
	public WebElement individualproducersearchicon1()
	{
		return individualproducersearchicon1;
	}
	
	@FindBy(name="UserSearchPopup-UserSearchPopupScreen-UserSearchDV-Username") WebElement usernameonindusersearchscreen;
	
	public WebElement usernameonindusersearchscreen()
	{
		return usernameonindusersearchscreen;
	}
	
	@FindBy(id="UserSearchPopup-UserSearchPopupScreen-UserSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search") WebElement searchbuttononInduser;
	
	public WebElement searchbuttononInduser()
	{
		return searchbuttononInduser;
	}
	
	@FindBy(xpath="//*[@id='UserSearchPopup-UserSearchPopupScreen-UserSearchResultsLV-0-_Select']") WebElement selectbuttononInduser;
	
	public WebElement selectbuttononInduser()
	{
		return selectbuttononInduser;
	}
	
	@FindBy(xpath="//div[@class='gw-label']//div[contains(text(), 'U')]") WebElement updatebutton;
	
	public WebElement updatebutton()
	{
		return updatebutton;
	}
	
	@FindBy(css="div[id='DuplicateContactsPopup-__crumb__']") WebElement returntocreateacclink;
	
	public WebElement returntocreateacclink()
	{
		return returntocreateacclink;
	}

	@FindBy(css="div[id='AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-AccountDetailsDetailViewTile_DV-1'] [id='AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-AccountDetailsDetailViewTile_DV-AccountNumber']") WebElement accountnumbertext;
	
	public WebElement accountnumbertext()
	{
		return accountnumbertext;
	}
	
	@FindBy(css="div[id='AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-AccountDetailsDetailViewTile_DV-AccountHolder_Input'] [id='AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-AccountDetailsDetailViewTile_DV-AccountHolder']") WebElement accountholdertext; 
	
	public WebElement accountholdertext()
	{
		return accountholdertext;
	}
	
}