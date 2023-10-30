package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Generic_Utility.WebDriverUtility;

public class CreateingNewContactPage  extends WebDriverUtility {

	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement LastNameEdt;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement SaveBtn;
	
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement orgLookUpimg;
	
	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement orgSearchEdt;
	
	@FindBy(xpath = "//input[@name='search']")
	private WebElement OrgSearchNowBtn;
	
	public CreateingNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getLastNameEdt() {
		return LastNameEdt;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}

	public WebElement getOrgLookUpimg() {
		return orgLookUpimg;
	}

	public WebElement getOrgSearchedt() {
		return orgSearchEdt;
	}

	public WebElement getOrgSearchNowBtn() {
		return OrgSearchNowBtn;
	}
	
	/**
	 * Bussiness Library
	 * This method will Work with Createing  New Contact
	 */
	
	public void createNewContact(String LASTNAME) {
	LastNameEdt.sendKeys(LASTNAME);
	SaveBtn.click();
	}
	
	public void createNewContact(WebDriver driver, String LastName,String ORGNAME) 
	{	
    LastNameEdt.sendKeys(LastName);
    orgLookUpimg.click();
    switchToWindow(driver,"Accounts");
    orgSearchEdt.sendKeys(ORGNAME);
    OrgSearchNowBtn.click();
    driver.findElement(By.xpath("//a[text()='"+ORGNAME+"']")).click();
    switchToWindow(driver, "Contacts");
    SaveBtn.click();
	}
}