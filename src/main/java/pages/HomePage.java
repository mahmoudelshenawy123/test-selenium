package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		action = new Actions(driver); 

	}
	@FindBy(linkText = "Register")
	WebElement registerbtn;
	@FindBy(className = "ico-login")
	WebElement loginbtn;
	@FindBy(linkText = "My account")
	WebElement myaccountbtn;
	@FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[1]/ul/li[6]/a")
	WebElement contactbtn;
	@FindBy(id="customerCurrency")
	WebElement currentbtn;
	@FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
	WebElement compbmenu;
	@FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a")
	WebElement deskele;
	public void Openregister() {
		registerbtn.click();
	}
	public void openLoginPage() {
		loginbtn.click();
	}
	public void openmyaccount() {
		myaccountbtn.click();
	}
	public void OpencontactUs() {
		contactbtn.click();
	}
	public void current(int index) {
		Select sel = new Select(currentbtn);
		sel.selectByIndex(index);
	}
	public void comphover() {
		action.moveToElement(compbmenu).moveToElement(deskele)
		.click()
		.build()
		.perform();
	}


}
