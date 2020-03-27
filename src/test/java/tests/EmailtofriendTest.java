package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.EmailToFriendPage;
import pages.HomePage;
import pages.OpenProductPage;
import pages.SearchPage;
import pages.UserRegisterationPage;

public class EmailtofriendTest extends TestBase{
	HomePage home ;
	SearchPage search;
	EmailToFriendPage epage;
	OpenProductPage page;
	UserRegisterationPage userpage;
	String email = "yugi00@gmail.com";
	@Test 
	public void openreg() {
		home = new HomePage(driver);
		home.Openregister();
	}
	@Test (priority = 1 ,dependsOnMethods = {"openreg"})
	public void userreg() {
		userpage= new UserRegisterationPage(driver);
		userpage.userregister("mahmoud", "elshenawy", "123456789", email);
		WebElement home = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a"));
		home.click();
	}
	
	@Test (priority = 2 , dependsOnMethods = {"userreg"})
	public void SearchProduct() {
		search = new SearchPage(driver);
		page = new OpenProductPage(driver);
		search.searchproduct("mac");
		page.openproduct();
	}
	@Test (priority = 3 , dependsOnMethods =  {"SearchProduct"})
	public void openemailpage() {
		epage = new EmailToFriendPage(driver);
		epage.OpenEmailPage();
	}
	@Test(priority =4 ,dependsOnMethods =  {"openemailpage" })
	public void sendemail()  {
	epage = new EmailToFriendPage(driver);
	epage.sendemail("yugi@gmail.com", email, "12332213213");
	}

}
