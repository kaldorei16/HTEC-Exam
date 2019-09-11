package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MainPage;
import pages.PageURLs;

// This is to check if the login will pass when the email is blank and password filled in and if the error message for email will appear

public class InvalidLogin2 {

	public static final String EMAIL = "";
	public static final String PASS = "Pass1234";

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

		Assert.assertTrue(mp.getEmailErrorText().contains("Email field is required"));

	}

}
