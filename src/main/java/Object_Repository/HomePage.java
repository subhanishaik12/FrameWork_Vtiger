package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utility.WebDriverUtility;

public class HomePage extends WebDriverUtility{
	
	@FindBy(xpath = "//a[text()='Calendar']")
	private WebElement calanderLnk;
	
	@FindBy(xpath = "(//a[text()='Leads'])[1]")
	private WebElement LeadsLnk;
	
	@FindBy(xpath = "//a[text()='Organizations']")
	private WebElement organizationsLnk;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement ContactsLnk;
	
	@FindBy(xpath = "//a[text()='Opportunities']")
	private WebElement opportunitiesLnk;
	
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement ProductsLnk;
	
	@FindBy(xpath = "//a[text()='Documents']")
	private WebElement DocumentsLnk;
	
	@FindBy(xpath = "(//img[@style='padding: 0px;padding-left:5px'])[1]")
	private WebElement AdministratorImg;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOutBtn;



/**
 * Intilization Home Page
 * @param driver
 */
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);		
	}

public WebElement getCalanderLnk() {
	return calanderLnk;
}

public WebElement getLeadsLnk() {
	return LeadsLnk;
}

public WebElement getOrganizationsLnk() {
	return organizationsLnk;
}

public WebElement getContactsLnk() {
	return ContactsLnk;
}

public WebElement getOpportunitiesLnk() {
	return opportunitiesLnk;
}

public WebElement getProductsLnk() {
	return ProductsLnk;
}

public WebElement getDocumentsLnk() {
	return DocumentsLnk;
}

public WebElement getAdministratorImg() {
	return AdministratorImg;
}

public WebElement getSignOutBtn() {
	return signOutBtn;
}
/**
 * This Is Bussiness Library For Home Page
 */

public void clickOnCalanderLnk() {
	calanderLnk.click();
}

public void clickOnLeadsLnk() {
	LeadsLnk.click();
}

public void clickOnOrganizationsLnk() {
organizationsLnk.click();
}

public void clickOnContactsLnk() {
	ContactsLnk.click();
}

public void clickOnOpportunitiesLnk() {
	opportunitiesLnk.click();
}
	
public void clickOnproductsLnk() {
	ProductsLnk.click();
}

public void clickOnDocumentsLnk() {
	DocumentsLnk.click();
}

public void clickOnAdministratorLnk() {
	AdministratorImg.click();
}

/**
 * This method will work on SignOut Operation
 * @param driver
 */
public void clickOnSignOutApp(WebDriver driver) {
	mouseHoverHandling(driver, AdministratorImg);
	signOutBtn.click();
	
	}
}
