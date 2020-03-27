package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilites.Helper;



public class TestBase {
	protected static WebDriver driver;
	@BeforeSuite
	@Parameters({"browser"})
	public static void openBrowser(@Optional("chrome") String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			String path = System.getProperty("user.dir")+"\\resoursess\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",path );
			driver = new ChromeDriver();
			
		}else if(browsername.equalsIgnoreCase("firefox")) {
			String path = System.getProperty("user.dir")+"\\resoursess\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver",path );
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.nopcommerce.com/");
	}
	@AfterSuite
	public static void closeBrowser() {
	}
	@AfterMethod
	public void screenshot(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			System.out.println("fail");
			Helper.capturescreenshot(driver, result.getName());
		}
		
	}
}
