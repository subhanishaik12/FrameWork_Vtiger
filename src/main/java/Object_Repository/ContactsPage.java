package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	
	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement LookUpcontactsimg;
	
	@FindBy(xpath = "//input[@name='selectall']")
	private WebElement ContactIdCheckBox;
	
	 @FindBy(xpath = "(//input[@class='crmbutton small delete'])[1]")
	private WebElement DeleteButton;
	 
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);		
	}

	public WebElement getLookUpcontactsimg() {
		return LookUpcontactsimg;
		
	}
	public WebElement getContactIdCheckBox() {
		return ContactIdCheckBox;	
	}
	public WebElement getDeleteButton() {
		return DeleteButton;
	}

	
	
	/**
	 * This method Will Work With Clicking OPeration On Create A new Contacts
	 * Bussiness Library
	 */
	public void ClickOnContactsLookUpImg() {
		LookUpcontactsimg.click();
	}
	public void ClickOnContactIdCheckBox() {
		ContactIdCheckBox.click();	
	}
	public void ClickOnDeleteButton() {
		DeleteButton.click();
	}
	
	
	

}
