package tests;

import org.testng.annotations.Test;

import pages.CompareListPage;
import pages.HomePage;
import pages.OpenProductPage;
import pages.ProductDertailPage;
import pages.ProductreviewPage;
import pages.SearchPage;
import pages.UserRegisterationPage;
import pages.WishlistPage;

public class ComparelistTEst extends TestBase{
	HomePage home ;
	UserRegisterationPage reg;
	SearchPage search;
	OpenProductPage opg;
	ProductreviewPage proRev;
	ProductDertailPage prodetail;
	WishlistPage wishp;
	CompareListPage compage;
	String email = "yugi005000s202101w0101245@gmail.com";
	String title = "review for prod";
	String msg = "ad123dsa213da213dsa21dsa";
	@Test
	public void openreg() {
		home = new HomePage(driver);
		reg = new UserRegisterationPage(driver);
		home.Openregister();
		reg.userregister("mahmoud", "Elshenawy", "123456789", email);
		reg.goToHomePage();
	}
	
	@Test(dependsOnMethods = {"openreg"})
	public void searchprod() {
		search = new SearchPage(driver);
		opg= new OpenProductPage(driver);
		search.searchproduct("mac");
		opg.openproduct();
	}
	@Test (dependsOnMethods = {"searchprod"})
	public void addproducttocomparelist() throws InterruptedException {
		prodetail = new ProductDertailPage(driver);
		prodetail.addtocomparelist();
	}@Test (dependsOnMethods = {"addproducttocomparelist"})
	public void check() {
		compage= new CompareListPage(driver);
		compage.checkElement();
	}
	@Test (dependsOnMethods = {"addproducttocomparelist"})
	public void removeproductfromcomparelist() {
		compage= new CompareListPage(driver);
		compage.deleteitem();
	}

}
