package tests;

import org.testng.annotations.Test;

import pages.AdddproductToShoppingCardPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.OpenProductPage;
import pages.ProductDertailPage;
import pages.ProductreviewPage;
import pages.SearchPage;
import pages.UserRegisterationPage;
import pages.WishlistPage;

public class AddTocartTest extends TestBase{
	HomePage home ;
	UserRegisterationPage reg;
	SearchPage search;
	OpenProductPage opg;
	ProductreviewPage proRev;
	ProductDertailPage prodetail;
	WishlistPage wishp;
	AdddproductToShoppingCardPage ad;
	CheckoutPage chc;
	String email = "y0u5d000050000d0s0000d@gmail.com";
	String title = "review for prod";
	String msg = "ad123dsa213da213dsa21dsa";
	String count="asddas";
	String add="54654654";
	String zip="5645656";
	String pho="2134456";
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
	public void addtocart() throws InterruptedException {
		prodetail = new ProductDertailPage(driver);
		prodetail.addtocart();
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods = {"addtocart"})
	public void gotocart() {
		prodetail = new ProductDertailPage(driver);
		prodetail.opencart();
	}
	@Test(dependsOnMethods = {"gotocart"})
	public void check() {
		ad=new AdddproductToShoppingCardPage(driver);
		ad.checkout();
	}
	@Test(dependsOnMethods = {"check"})
	public void checkout() throws InterruptedException {
		chc= new CheckoutPage(driver);
		chc.buy(count, add, zip, pho);
	}
}
