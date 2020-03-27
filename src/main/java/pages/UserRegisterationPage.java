package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage extends PageBase {

	public UserRegisterationPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="gender-female")
	WebElement radibtn;
	@FindBy(id="FirstName")
	WebElement firstnametxt;
	@FindBy(id="LastName")
	WebElement lastnametxt;
	@FindBy (id="Password")
	WebElement passtxt;
	@FindBy(id="ConfirmPassword")
	WebElement confirmpasstxt;
	@FindBy(id="Email")
	WebElement emailtxt;
	@FindBy(id="register-button")
	WebElement registerbtn;
	@FindBy(linkText = "Log out")
	WebElement logot;
	@FindBy(linkText = "My account")
	WebElement myaccountbutton;
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[2]/div[1]/a")
	WebElement homepagebtn;
	
	public void userregister(String firstname,String lastname, String pass  ,String email) {
		btnclick(radibtn);
		txtsend(firstnametxt,firstname);
		txtsend(lastnametxt,lastname);
		txtsend(emailtxt,email);
		txtsend(passtxt,pass);
		txtsend(confirmpasstxt,pass);
		btnclick(registerbtn);
	}
	public void registerout() {
		btnclick(logot);
	}
	public void openmyaccountpage() {
		myaccountbutton.click();
	}
	public void goToHomePage() {
		homepagebtn.click();
	}
}
