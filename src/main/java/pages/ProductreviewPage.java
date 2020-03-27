package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductreviewPage extends PageBase {

	public ProductreviewPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="AddProductReview_Title")
	WebElement pReviewTitle;
	@FindBy(id = "AddProductReview_ReviewText")
	WebElement pReviewtxt;
	@FindBy(xpath = "//*[@id=\"addproductrating_5\"]")
	WebElement radiobtn;
	@FindBy(xpath = "//*[@id=\"review-form\"]/form/div[2]/input")
	WebElement submitbtn;
	 public void review(String title,String msg) {
		 
		 pReviewTitle.sendKeys(title);
		 pReviewtxt.sendKeys(msg);
		 radiobtn.click();
		 submitbtn.click();
	 }
	

}
