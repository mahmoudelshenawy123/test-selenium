package tests;

import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase {
	HomePage home ;
	ContactUsPage page;
	@Test
	public void contactus() {
		home= new HomePage(driver);
		page = new ContactUsPage(driver);
		home.OpencontactUs();
		page.contactUsSubmit("Mahmoud", "yug0i@gmail.com", "adsdsadadsdsaadsdasdsa");
	}
}
