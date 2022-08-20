package tests;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;

public class SetUp 
{
	//String driverPath = "C:\\geckodriver.exe";
	WebDriver driver;
	HomePage hp;
	SignUpPage sp;
	
	@BeforeTest
	  public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91879\\eclipse-workspace\\first\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.browserstack.com/");
	}
	
	  @Test(priority = 1)
	  public void navigate_to_homepage_click_on_getstarted() {
	  hp = new HomePage(driver);
	  hp.veryHeader();
	  hp.clickOnGetStarted();
	  }
	
	  @Test(priority = 2)
	  public void enter_userDetails() 
	  {
	  sp = new SignUpPage(driver);
	  sp.veryHeader();
	  sp.enterFullName("TestUser");
	  sp.enterBusinessEmail("TestUser@gmail.com");
	  sp.enterPasswrod("TestUserPassword");
	  }

}
