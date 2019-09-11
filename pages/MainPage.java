package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

	static WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements

	private static WebElement loginBtn() {
		return driver.findElement(By.cssSelector("div.row a.btn-secondary"));
	}

	private static WebElement email() {
		return driver.findElement(By.name("email"));
	}

	private static WebElement password() {
		return driver.findElement(By.name("password"));
	}

	private static WebElement submitBtn() {
		return driver.findElement(By.cssSelector("div.row button.mt-4"));
	}

	private static WebElement emailError() {
		return driver.findElement(By.cssSelector("div.row div.invalid-feedback"));
	}

	private static WebElement passwordError() {
		return driver.findElement(By.cssSelector("div.row div.invalid-feedback"));
	}

	// Actions

	public void clickLoginBtn() {
		loginBtn().click();
	}

	public void inputEmail(String searchTerm) {
		email().sendKeys(searchTerm);
	}

	public void inputpass(String searchTerm) {
		password().sendKeys(searchTerm);
	}

	public void clickSubmitBtn() {
		submitBtn().click();
	}

	public String getEmailErrorText() {
		return emailError().getText();
	}

	public String getPasswordErrorText() {
		return passwordError().getText();
	}

}
