package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MainPage;
import pages.PageURLs;

// This is to check if the login will pass with the correct format of the email and short password
// and check if there is an error message for the password

public class InvalidLogin9 {
	
	public static final String EMAIL = "milaan88@gmail.com";
	public static final String PASS = "pass";

	WebDriver driver;

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Milan16\\Desktop\\Domaci\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void loginTest1() throws Exception {

		driver.navigate().to(PageURLs.QA_HOME);
		driver.manage().window().maximize();

		MainPage mp = new MainPage(driver);

		mp.clickLoginBtn();
		Thread.sleep(2000);

		mp.inputEmail(EMAIL);
		Thread.sleep(2000);

		mp.inputpass(PASS);
		Thread.sleep(2000);

		mp.clickSubmitBtn();
		Thread.sleep(2000);

		Assert.assertTrue(mp.getPasswordErrorText().contains("Password must be at least 6 characters long"));

	}

}
