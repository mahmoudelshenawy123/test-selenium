package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[@id=\"small-search-box-form\"]/input[2]")
	WebElement searchbtn;
	@FindBy(id="small-searchterms")
	WebElement searchtxt;
	@FindBy (id="ui-id-1")
	List<WebElement> searchdrop;
	
	public void searchproduct(String search) {
		searchtxt.sendKeys(search);
		searchbtn.click();
	}
	public void searchauto(String search) throws InterruptedException {
		searchtxt.sendKeys(search);
		Thread.sleep(2000);
		searchdrop.get(0).click();
	}
	
}
