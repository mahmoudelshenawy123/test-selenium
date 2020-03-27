package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.OpenProductPage;
import pages.ProductDertailPage;
import pages.ProductreviewPage;
import pages.SearchPage;
import pages.UserRegisterationPage;
import pages.WishlistPage;

public class AddProductToWishlist extends TestBase{
	HomePage home ;
	UserRegisterationPage reg;
	SearchPage search;
	OpenProductPage opg;
	ProductreviewPage proRev;
	ProductDertailPage prodetail;
	WishlistPage wishp;
	String email = "yugi0000021010101245@gmail.com";
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
	@Test(dependsOnMethods = {"searchprod"})
	public void addtowish() throws InterruptedException {
		prodetail = new ProductDertailPage(driver);
		prodetail.addToWishlist();
		Thread.sleep(2000);
	}
	@Test (dependsOnMethods = {"addtowish"})
	public void addprod() {
		wishp = new WishlistPage(driver);
		wishp.removepro();
	}
	


}
