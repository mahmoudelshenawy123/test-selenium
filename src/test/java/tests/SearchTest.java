package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.OpenProductPage;
import pages.SearchPage;

public class SearchTest extends TestBase{
	HomePage home;
	SearchPage search;
	OpenProductPage page;
	@Test
	public void searchpr() {
		home = new HomePage(driver);
		search= new SearchPage(driver);
		page=new OpenProductPage(driver);
		search.searchproduct("Apple MacBook Pro 13");
		page.openproduct();
	}
}
