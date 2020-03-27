package tests;

import org.testng.annotations.Test;

import pages.HomePage;

public class ProductHoverMenuPage extends TestBase {
	HomePage home ;
	@Test
	public void hovermen() {
		home = new HomePage(driver);
		home.comphover();
	}

}
