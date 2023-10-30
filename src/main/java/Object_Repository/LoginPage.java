package Object_Repository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author SUBHANI SHAIK
 * Vtiger Login Page
 */
public class LoginPage {
	
	@FindBy(css = "input[name='user_name']")
	private WebElement userNameEdt;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passWordEdt;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginBtn;
/**
 * Create Constuctors
 * @param driver
 */
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getPassWord() {
		return passWordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
/**
 * Bussiness Libraries
 * @param username
 * @param password
 */
public void LoginToApp(String username,String password) {
	userNameEdt.sendKeys(username);
	passWordEdt.sendKeys(password);
	loginBtn.click();
}
	
}
