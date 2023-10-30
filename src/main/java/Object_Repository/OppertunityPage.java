package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OppertunityPage {
	
	@FindBy(xpath = "//img[@title='Create Opportunity...']")
	private WebElement LookUpOppImg;
	
	public OppertunityPage(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}

	public WebElement getClickOnSaveBtn() {
		return LookUpOppImg;
	}
	public void ClickOnOppLookUpImg() {
		LookUpOppImg.click();
	}

}
