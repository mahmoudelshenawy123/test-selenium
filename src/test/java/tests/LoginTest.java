package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase {
	HomePage home ;
	LoginPage login;
	@Test
	public void login1() {
		home=new HomePage(driver);
		login = new LoginPage(driver);
		home.openLoginPage();
		login.login("yugig100001x6@gmail.com","123456789");
	}

}
