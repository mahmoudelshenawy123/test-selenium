package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="Email")
	WebElement emailtxt;
	@FindBy(id="Password")
	WebElement passtxt;
	@FindBy(id="RememberMe")
	WebElement remeberbtn;
	@FindBy(xpath  ="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input")
	WebElement loginbt;
	public void login(String Email ,String Pass) {
		txtsend(emailtxt,Email);
		txtsend(passtxt,Pass);
		btnclick(remeberbtn);
		btnclick(loginbt);
	}
}
