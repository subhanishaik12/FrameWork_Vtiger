package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	@FindBy(xpath = "//img[@title='Create Product...']")
	private WebElement 	ProductImg;
	
	/**
	 * Intilization
	 */
	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getProductImg() {
		return ProductImg;
	}
	/**
	 * Bussiness Library this Method Will Work With Navigaate To Create
	 * A new Product
	 */
	public void clickOnProductsImg() {
		ProductImg.click();
	}
	
}
