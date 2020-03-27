package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.MyAccountPage;
import pages.UserRegisterationPage;

public class MyAccountTest extends TestBase {
	HomePage home;
	UserRegisterationPage reg;
	MyAccountPage pag;
	String pass = "123456789";
	@Test
	public void create () {
		home=new HomePage(driver);
		reg= new UserRegisterationPage(driver);
		home.Openregister();
		reg.userregister("mahmoud","ELshenawy",pass,"yugi001@gmail.com");
		reg.openmyaccountpage();
	}
	@Test
	public void myacc() {
		pag=new MyAccountPage(driver);
		
		pag.changepass(pass, "123456789987", "123456789987");
	}

}
