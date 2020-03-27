package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDertailPage extends PageBase{

	public ProductDertailPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath ="//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[3]/div[2]/a[2]")
	WebElement revbtn;
	@FindBy(xpath = "//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[8]/div/span")
	WebElement txt ;
	@FindBy(xpath = "//*[@id=\"add-to-wishlist-button-4\"]")
	WebElement wishbtn;
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a")
	WebElement wisho;
	@FindBy(xpath = "//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[10]/div[2]/input")
	WebElement comparebtn;
	@FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[2]/ul/li[5]/a")
	WebElement comparebtngo;
	@FindBy(id = "add-to-cart-button-4")
	WebElement addcartbtn;
	@FindBy(linkText = "Shopping cart")
	WebElement opecartbtn;
	public void productlbl() {
		txt.getText();
	}
	public void openrev() {
		revbtn.click();
	}
	public void addToWishlist() {
		wishbtn.click();
		wisho.click();
	}
	public void addtocomparelist() throws InterruptedException {
		comparebtn.click();
		Thread.sleep(2000);
		comparebtngo.click();
	}
	public void addtocart() {
		addcartbtn.click();
	}
	public void opencart() {
		opecartbtn.click();
	}
	

}
