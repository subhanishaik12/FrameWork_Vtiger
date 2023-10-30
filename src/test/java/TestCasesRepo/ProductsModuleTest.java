package TestCasesRepo;

import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.ExcelUtility;
import Object_Repository.CreatingNewProductsPage;
import Object_Repository.HomePage;
import Object_Repository.ProductsPage;

public class ProductsModuleTest extends BaseClass {
	@Test 
	public void creatingProductsModule() throws  Exception {
		HomePage hp=new HomePage(driver);
		hp.clickOnproductsLnk();
		ProductsPage pp=new ProductsPage(driver);
		pp.clickOnProductsImg();
		ExcelUtility eutil=new ExcelUtility();
	String PRODUCTNAME=	eutil.getDataFromExcel("Contacts", 7, 3);
		CreatingNewProductsPage cp=new CreatingNewProductsPage(driver);
		cp.createNewProduct(PRODUCTNAME);
				
		
		
		
		
	}

}
