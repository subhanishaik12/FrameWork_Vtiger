package TestCasesRepo;



import org.testng.annotations.Test;
import Generic_Utility.BaseClass;
import Generic_Utility.ExcelUtility;
import Object_Repository.CreateNewOrganizationpage;
import Object_Repository.HomePage;
import Object_Repository.OrganizationPage;

public class OrganizationModuleTest extends BaseClass{
	@Test
	public void OrganizationsTest() throws Exception, Exception {
	HomePage hp=new HomePage(driver);
	hp.clickOnOrganizationsLnk();;
	OrganizationPage og=new OrganizationPage(driver);
	og.clickOnCreateOrLookUpImg();
	ExcelUtility eutil=new ExcelUtility();
	String 	OrgName=eutil.getDataFromExcel("Contacts", 7, 3);
	//Assert.assertEquals(true, OrgName);
	System.out.println("Sucessful");
	CreateNewOrganizationpage cnop=new CreateNewOrganizationpage(driver);
	cnop.createNewOrganization(OrgName);	
		
	}
	}

	
	
		
		


