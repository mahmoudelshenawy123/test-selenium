package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserRegisterationPage;

public class UserRegisterationTest extends TestBase {
	HomePage home ;
	UserRegisterationPage userpage;
	LoginPage logi;
	@Test(priority = 1)
	public void registersucces() {
		home = new HomePage(driver);
		userpage = new UserRegisterationPage(driver);
		home.Openregister();
		userpage.userregister("mahmoud", "Elshenawy", "123456789", "yugigx10600000000@gmail.com");
	}
	@Test(priority=2,dependsOnMethods = {"registersucces"}) 
	public void registerout1() {
		userpage.registerout();
	}
	@Test(priority = 3 ,dependsOnMethods = {"registerout1"} )
	public void login2() {
		home = new HomePage(driver);
		home.openLoginPage();
		logi= new LoginPage(driver);
		logi.login("yugigx10600000000@gmail.com","123456789");
	}
}
