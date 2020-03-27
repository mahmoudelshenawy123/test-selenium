package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase{

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="FullName")
	WebElement nametxt;
	@FindBy(id="Email")
	WebElement emailtxt;
	@FindBy(id="Enquiry")
	WebElement enquirytxt;
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/input")
	WebElement submitbtn;
	public void contactUsSubmit(String name,String email,String enquiry) {
		nametxt.sendKeys(name);
		emailtxt.sendKeys(email);
		enquirytxt.sendKeys(enquiry);
		submitbtn.click();
	}
}
