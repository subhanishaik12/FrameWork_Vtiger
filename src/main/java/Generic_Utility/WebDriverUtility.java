package Generic_Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.io.Files;
/**
 * This class is related to all webdriver Actions
 * @author SUBHANI SHAIK
 *
 */
public class WebDriverUtility {
	
	/**
	 * This method will perform the maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();	
     }
	/**
	 * This method will perform Maximize  the window
	 * @param driver
	 */
	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	/**
	 * This method will perform page load to 10 seconds
	 * @param driver
	 */
	public void pageWaitLoader(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	/**
	 * This method will wait for 10 seconds
	 * @param driver
	 * @param element
	 * Explictly Conditions
	 */
	public void waitforElementToBeVisible(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));	
	}
	/**
	 * DropDownHandling
	 * @param element
	 * @param index
	 */
	public void dropDownHandling(WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);	
	}
	public void dropDownHandling(WebElement element,String VisibleText) {
		Select sel=new Select(element);
		sel.selectByVisibleText(VisibleText);
	}
	
	public void dropDownHandling(String value,WebElement element) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	/**
	 * This Method Will Perform Actions In weblement
	 * @param driver
	 * @param element
	 */
	public void mouseHoverHandling(WebDriver driver,WebElement element){
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();	
	}
	/**
	 * This method will perform Right Click Action In a Page
	 * @param driver
	 * WithOut Webelement
	 */
	public void rightClickAction(WebDriver driver) {
		Actions act=new Actions(driver).contextClick();	
	}
	/**
	 * This method will perform Right Click Action In a Page
	 * @param driver
	 * @param element
	 * with Weblement
	 */
	public void rightClickAction(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver).contextClick();	
	}
	/**
	 * Right Click Action
	 * @param driver
	 * @param element
	 */
	public void doubleClickAction(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	/**
	 * This Method will perform drag a particular webelemet
	 * @param driver
	 * @param element
	 */
	public void dragAndDrop(WebDriver driver,WebElement srcelement,WebElement Targetelement){
		Actions act=new Actions(driver);
		act.dragAndDrop(srcelement, Targetelement).perform();	
	}
	
	public void dragAndDropB(WebElement src,WebDriver driver,int x,int y){
		Actions act=new Actions(driver);
		act.dragAndDropBy(src,x,y).perform();	
	}
	/**
	 * This method will works with related to frmesHandling
	 * @param driver
	 * @param element
	 * @param x
	 */
	public void switchToframes(WebDriver driver,int x) {
		driver.switchTo().frame(x);	
	}
	/**
	 * This method will works with related to frmesHandling with nameOrId
	 * @param driver
	 * @param nameOrId
	 */
	public void switchToframes(WebDriver driver,String nameOrId) {
		driver.switchTo().frame(nameOrId);	
	}
	public void switchToframes(WebDriver driver,WebElement element) {
		
		driver.switchTo().frame(element);	
	}
	public void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	public void switchToDefaultFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	/**
	 * This method will works with PopUp handling 
	 * @param driver
	 * Accept method
	 */
	public void acceptPopUp(WebDriver driver){
		driver.switchTo().alert().accept();
	}
	/**
	 * This method will works with PopUp handling 
	 * @param driver
	 * Dismiss method
	 */
	public void dismissPopUp(WebDriver driver){
		driver.switchTo().alert().dismiss();	
     }  
	public String getTextmsg(WebDriver driver){
	return	driver.switchTo().alert().getText();
	}
	/**
	 * ScreenShot Handling
	 * @param driver
	 * @throws IOException 
	 */
	public String TakesScreeShot(WebDriver driver,String ScreenShotName) throws IOException {
	 TakesScreenshot ts=(TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File dest=new File(".\\ScreeShots\\"+ScreenShotName+".png");
Files.copy(src, dest);
return dest.getAbsolutePath();
	}
	
	public void scrollDownHandling(WebDriver driver){
	JavascriptExecutor jse=(JavascriptExecutor)	driver;
	jse.executeScript("windows.scrollBy(0,300);", null);	
	}
	/**
	 * 
	 * @param driver
	 * @param partialWindowTitle
	 */
	public void switchToWindow(WebDriver driver,String partialWindowTitle) {
		Set<String> windowID=driver.getWindowHandles();
		for(String winid:windowID)
		{
			
	String ActTitle=driver.switchTo().window(partialWindowTitle).getTitle();
	if(ActTitle.contains(partialWindowTitle))
		break;
		}		
	}
	
}
