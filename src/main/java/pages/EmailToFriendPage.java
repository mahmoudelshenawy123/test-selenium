package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailToFriendPage extends PageBase{

	public EmailToFriendPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "FriendEmail")
	WebElement friendemail;
	@FindBy(id = "YourEmailAddress")
	WebElement myemail;
	@FindBy(id = "PersonalMessage")
	WebElement msg ;
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/input")
	WebElement sendbtn;
	@FindBy(xpath ="//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[10]/div[3]/input")
	WebElement emailbtn;
	public void sendemail(String femail,String memail,String pmsg) {
		friendemail.sendKeys(femail);
		myemail.sendKeys(memail);
		msg.sendKeys(pmsg);
		sendbtn.click();
	}
	public void OpenEmailPage() {
		emailbtn.click();
	}

}
