package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.OpenProductPage;
import pages.ProductDertailPage;
import pages.ProductreviewPage;
import pages.SearchPage;
import pages.UserRegisterationPage;

public class ProductReviewTest extends TestBase {
	HomePage home ;
	UserRegisterationPage reg;
	SearchPage search;
	OpenProductPage opg;
	ProductreviewPage proRev;
	ProductDertailPage prodetail;
	String email = "yugi000000001245@gmail.com";
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
	public void openrevi() {
		prodetail = new ProductDertailPage(driver);
		prodetail.openrev();
	}@Test(dependsOnMethods = {"openrevi"})
	public void addreview() {
		proRev = new ProductreviewPage(driver);
		proRev.review(title, msg);
	}

}
