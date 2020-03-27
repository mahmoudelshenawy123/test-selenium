package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.OpenProductPage;
import pages.ProductDertailPage;
import pages.SearchPage;

public class CurrentTest extends TestBase{
	HomePage home;
	SearchPage search;
	OpenProductPage pPage;
	ProductDertailPage pdp;
	int index = 1;
	@Test 
	public void currentcheck() {
		home=new HomePage(driver);
		home.current(index);
	}
	@Test (dependsOnMethods = {"currentcheck"} )
	public void searchp() {
		search = new SearchPage(driver);
		pPage = new  OpenProductPage(driver);
		search.searchproduct("mac");
		pPage.openproduct();
	}
	
	@Test(dependsOnMethods = {"searchp"})
	public void checktrue() {
		pdp=new ProductDertailPage(driver);
		System.out.println("pdp.productlbl()");
		if (index==1) {
			Assert.assertTrue("pdp.productlbl()".contains("Ђ"));
		}else if(index==0) {
			Assert.assertTrue("pdp.productlbl()".contains("$"));
		}
		
		}

}
