package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends PageBase {

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(id ="BillingNewAddress_CountryId")
	WebElement country ;
	@FindBy(id = "BillingNewAddress_StateProvinceId")
	WebElement state;
	@FindBy(id="BillingNewAddress_City")
	WebElement city;
	@FindBy(id="BillingNewAddress_Address1")
	WebElement address;
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	WebElement zipnum ;
	@FindBy(id="BillingNewAddress_PhoneNumber")
	WebElement phonenum;
	@FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/input")
	WebElement continuetn;
	@FindBy(id="shippingoption_1")
	WebElement shipbtn ;
	@FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/input")
	WebElement con1btn;
	@FindBy(id="paymentmethod_0")
	WebElement moneybtn;
	@FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/input")
	WebElement con2btn;
	@FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/input")
	WebElement con3btn;
	@FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/input")
	WebElement con4btn;
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[3]/input")
	WebElement con5btn;
	public void buy(String cit,String add,String zip,String pho) throws InterruptedException {
		Select sel = new Select(country);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		Select sel1 = new Select(state);
		sel1.selectByIndex(2);
		Thread.sleep(2000);

		city.sendKeys(cit);
		address.sendKeys(add);
		zipnum.sendKeys(zip);
		phonenum.sendKeys(pho);		
		continuetn.click();
		Thread.sleep(2000);
		shipbtn.click();
		Thread.sleep(2000);
		con1btn.click();
		Thread.sleep(2000);
		moneybtn.click();
		Thread.sleep(2000);
		con2btn.click();
		Thread.sleep(2000);
		con3btn.click();
		Thread.sleep(2000);
		con4btn.click();
	
		
		
	}
	
}
