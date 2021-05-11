package test;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import page.AddUserPage;
import page.HomePage;
import page.LoginPage;

public class DemoTests {
	
	public static final String URL = "http://thedemosite.co.uk/index.php";
	
	private WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		options.setHeadless(true);
		
		driver = new ChromeDriver(options);
		driver.manage().window().setSize(new Dimension(1368,768));
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
	}
	
	@Test
	public void testlogin() {
		driver.get(URL);
		
		HomePage homePage = PageFactory.initElements(driver,HomePage.class );
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		AddUserPage userPage = PageFactory.initElements(driver,AddUserPage.class);
		
		String username = "user";
		String password = "handler";
		
		homePage.getAddUserLink().click();
		
		userPage.addUser(username, password);
		
		homePage.getLoginLink().click();
		
		loginPage.login(username, password);
		
		assertTrue(driver.getPageSource().contains("**Successful Login**"));
		
		
	}

}
