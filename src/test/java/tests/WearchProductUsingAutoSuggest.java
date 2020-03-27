package tests;

import org.testng.annotations.Test;

import pages.SearchPage;

public class WearchProductUsingAutoSuggest extends TestBase{
	SearchPage search;

	@Test
	public void searchat() throws InterruptedException  {
		search= new SearchPage(driver);
		search.searchauto("mac");
	}
}
