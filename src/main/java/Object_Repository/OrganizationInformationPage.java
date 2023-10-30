package Object_Repository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationPage {
	
	@FindBy(xpath = "(//span['[ ACC9 ] AAAAA -  Organization Information'])[3]")
	private WebElement OrganizationInformation;
	
	public OrganizationInformationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrganizationInformation() {
		return OrganizationInformation;
	}
	/**
	 * Bussiness Library
	 */
	public String getOrganizationInformationTxt() {
		return OrganizationInformation.getText();
	}
	
	
	
}
