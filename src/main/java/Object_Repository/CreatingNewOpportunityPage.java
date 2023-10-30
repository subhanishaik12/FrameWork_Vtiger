package Object_Repository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewOpportunityPage {
	
	@FindBy(xpath="//input[@name='potentialname']")
	private WebElement OpportunityNameEdt;
	
	@FindBy(xpath = "//td[@style='padding:5px']/div[1]/input[@title='Save [Alt+S]'][1]")
	private WebElement ClickOnSaveBtn;
	
	public CreatingNewOpportunityPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getOpportunityName() {
		return OpportunityNameEdt;
	}

	public WebElement getClickOnSaveButton() {
		return ClickOnSaveBtn;
	}
	
	public void createNewOppertunity(String OPPERTUNITYNAME) {
		OpportunityNameEdt.sendKeys(OPPERTUNITYNAME);
		ClickOnSaveBtn.click();
	}
	

}
