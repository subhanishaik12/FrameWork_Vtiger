package Generic_Utility;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import Object_Repository.HomePage;
import Object_Repository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This Class Consists All the Basic Configuration 
 * @author SUBHANI 
 *
 */
public class BaseClass {
public	PropertiesFileUtility putil=new PropertiesFileUtility();
public	ExcelUtility eutil=new ExcelUtility();
public	WebDriverUtility wutil=new WebDriverUtility();
public  JavaUtility jutil=new JavaUtility();
public  WebDriver driver=null;
 
//public static WebDriver sdriver;
	
	
	
	@BeforeSuite
	public void bsConfigure() {
		
	System.out.println("*****Data Base Connection Sucessfull*****");
		
	}
	
	@BeforeClass
	public void bcConfigure() throws Throwable {
		
	String	BROWSER=putil.GetDataFromPropertiesUtility("browser");
    String  URL=putil.GetDataFromPropertiesUtility("url");
  
//launch driver
    
   
	if(BROWSER.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	}
	else if(BROWSER.equalsIgnoreCase("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
	else 
	{
		System.out.println("driver not launched");
	}

		
  driver.get(URL);
  wutil.pageWaitLoader(driver);
  wutil.maximizeWindow(driver);
 // driver=sdriver;
  System.out.println("*****Browser Launch Sucessfull*****");	
	}
	
	@BeforeMethod
	public void bmConfigure() throws Throwable {
		
String USERNAME=putil.GetDataFromPropertiesUtility("username");
  String PASSWORD=putil.GetDataFromPropertiesUtility("password");
		LoginPage lp=new LoginPage(driver);
		lp.LoginToApp(USERNAME, PASSWORD);
		System.out.println("***** Browser login Application Sucessfully");
	}
	@AfterMethod
	public void amConfigure() {
		HomePage hp=new HomePage(driver);
		hp.clickOnSignOutApp(driver);
		System.out.println("Browser SignOut Sucessfull ");
		
	}
	@AfterClass
	public void acConfigure() {
		driver.quit();
		System.out.println("Browser Closed sucessfull");
		
	}
	@AfterSuite
	public void asConfigure() {
		System.out.println("Data Base Closed Sucessfull");
	}

}
