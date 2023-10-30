package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganizationpage {
	
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement CreateNewOrgnizationEdt;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
	private WebElement clickOnSaveBtn;
	
	public CreateNewOrganizationpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	/**
	 * Bussiness Library
	 */
	public void createNewOrganization(String ORGANAME) {
		CreateNewOrgnizationEdt.sendKeys(ORGANAME);
		clickOnSaveBtn.click();
		
		
		
		
	}
		
	}
