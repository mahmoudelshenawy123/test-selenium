package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompareListPage extends PageBase {

	public CompareListPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]/input")
	WebElement deleteitembtn;
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/a")
	WebElement deletelistbtn;
	@FindBy(tagName = "tr")
	List<WebElement> rows;
	@FindBy(tagName = "td")
	List<WebElement> cols;
	public void deleteitem() {
		deleteitembtn.click();
	}
	public void deletelist() {
		deletelistbtn.click();
	}
	public void checkElement() {
		for (WebElement row:rows) {
			System.out.println(row.getText()+"\t");
			for(WebElement col:cols) {
				System.out.println(col.getText()+"\t");
			}
		}
	}


}
