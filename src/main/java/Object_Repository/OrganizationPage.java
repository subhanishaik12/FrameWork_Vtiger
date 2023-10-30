package Object_Repository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {

@FindBy(xpath = "//img[@title='Create Organization...']")
private WebElement clickOnLookUpImg;

/**
 * Intilizatiion Web Elements
 * @param driver
 */
public OrganizationPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getClickOnLookUpImg() {
	return clickOnLookUpImg;
}

/**
 * Bussiness Library
 * This method will work with Create New Organization
 */

public void clickOnCreateOrLookUpImg() {
	 clickOnLookUpImg.click();
} 

	
}

