package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText = "Change password")
	WebElement changepass;
	@FindBy(id="OldPassword")
	WebElement oldpass;
	@FindBy(id="NewPassword")
	WebElement newpass;
	@FindBy(id="ConfirmNewPassword")
	WebElement confirmpass;
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/input")
	WebElement changebtn;
	public void changepass(String oldpasstxt,String newpasstxt, String Confirmpasstxt) {
		changepass.click();
		oldpass.sendKeys(oldpasstxt);
		newpass.sendKeys(newpasstxt);
		confirmpass.sendKeys(Confirmpasstxt);
		changebtn.click();
		
	}

}
