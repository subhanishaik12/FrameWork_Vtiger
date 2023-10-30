package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utility.WebDriverUtility;

public class CreatingNewProductsPage extends WebDriverUtility {
	
	@FindBy(xpath = "//input[@name='productname']")
	private WebElement productNameBtn;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	
	public CreatingNewProductsPage(WebDriver driver) {
	PageFactory.initElements(driver,this);	
}

	public WebElement getProductNameBtn() {
		return productNameBtn;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void  createNewProduct(String ProductName ) {	
		productNameBtn.sendKeys(ProductName);
		saveBtn.click();
	}
}