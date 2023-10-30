package TestCasesRepo;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Generic_Utility.BaseClass;
import Generic_Utility.ExcelUtility;
import Generic_Utility.WebDriverUtility;
import Object_Repository.ContactsPage;
import Object_Repository.CreateNewOrganizationpage;
import Object_Repository.CreateingNewContactPage;
import Object_Repository.HomePage;
import Object_Repository.OrganizationPage;


 @Listeners(Generic_Utility.ItestListnersImplementation.class) 
public class ContactsTest extends BaseClass {
	@Test
	public void CreatingContactsModule() throws IOException, Throwable
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnContactsLnk();
		ContactsPage cp=new ContactsPage(driver);
		cp.ClickOnContactIdCheckBox();
		cp.ClickOnDeleteButton();
		WebDriverUtility wutil=new WebDriverUtility();
		wutil.acceptPopUp(driver);
		
		cp.ClickOnContactsLookUpImg();
	CreateingNewContactPage cncp=new CreateingNewContactPage(driver);
		ExcelUtility eutil=new ExcelUtility();
String LASTNAME=eutil.getDataFromExcel("Contacts", 1, 2);
		cncp.createNewContact(LASTNAME);
		System.out.println("Contact Create Sucessfull");
		

	}
	@Test
	public void OrganizationsTest() throws Exception, Exception {
		HomePage hp=new HomePage(driver);
		hp.clickOnOrganizationsLnk();
		OrganizationPage og=new OrganizationPage(driver);
		og.clickOnCreateOrLookUpImg();
		ExcelUtility eutil=new ExcelUtility();
		String 	OrgName=eutil.getDataFromExcel("Contacts", 7, 3);
		CreateNewOrganizationpage cnop=new CreateNewOrganizationpage(driver);
		cnop.createNewOrganization(OrgName);
	}	
}
