package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdddproductToShoppingCardPage  extends PageBase{

	public AdddproductToShoppingCardPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "removefromcart21123")
	WebElement removebtn ;
	@FindBy(id = "itemquantity21123")
	WebElement  numbertxt;
	@FindBy(xpath = "//*[@id=\"shopping-cart-form\"]/div[2]/div[1]/input[1]")
	WebElement updatebtn;
	@FindBy(xpath = "//*[@id=\"shopping-cart-form\"]/div[2]/div[1]/input[2]")
	WebElement continuebtn;
	@FindBy(id = "CountryId")
	WebElement cuntrysel ;
	@FindBy(id = "StateProvinceId")
	WebElement stateselect ;
	@FindBy(id = "ZipPostalCode")
	WebElement ziptxt ;
	@FindBy(id = "discountcouponcode")
	WebElement discounttxt ;
	@FindBy(id = "applydiscountcouponcode")
	WebElement applycouponbtn ;
	@FindBy(id = "giftcardcouponcode")
	WebElement giftcrdtxt ;
	@FindBy(id = "applygiftcardcouponcode")
	WebElement giftbtn ;
	@FindBy(id = "termsofservice")
	WebElement agreebtn ;
	@FindBy(id = "checkout")
	WebElement checkoutbtn ;
	public void removeitem() {
		removebtn.click();
		updatebtn.click();
	}
	public void changenumberofitems(String num) {
		numbertxt.clear();
		numbertxt.sendKeys(num);
		updatebtn.click();
	}
	public void checkout() {
		agreebtn.click();
		checkoutbtn.click();
	}
	
	

}
