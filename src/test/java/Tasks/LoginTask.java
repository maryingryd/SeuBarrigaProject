package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Browser.Waits;
import Framework.Utils.FileOperation;
import PageObjects.LoginPage;
import Validations.LoginValidation;

public class LoginTask {
	private WebDriver driver;
	private LoginPage loginPage;
	private LoginValidation loginValidation;
	private Waits wait;

	public LoginTask(WebDriver driver) {
		this.driver = driver;
		loginPage = new LoginPage(this.driver);
		loginValidation = new LoginValidation(this.driver);
		wait = new Waits(this.driver);
	}

	public void efetuarLogin() {
		wait.loadElement(loginPage.getEmailInput());
		loginPage.getEmailInput().click();
		loginValidation.validationLoginPage();
		loginPage.getEmailInput().click();
		loginPage.getEmailInput().sendKeys(FileOperation.getProperties("form").getProperty("email"));
		loginPage.getPasswordInput().sendKeys(FileOperation.getProperties("form").getProperty("password"));
		loginPage.getLoginButton().click();
	}

}
