package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Utils.FileOperation;
import PageObjects.LoginPage;
import Validations.LoginValidation;

public class LoginTask {
	private WebDriver driver;
	private LoginPage loginPage;
	public LoginTask(WebDriver driver) {

		this.driver = driver;
		loginPage = new LoginPage(this.driver);
		new LoginValidation(this.driver);
	}

	public void efetuarLogin() {
		loginPage.getEmailInput().click();
		loginPage.getEmailInput().click();
		loginPage.getEmailInput().sendKeys(FileOperation.getProperties("form").getProperty("email"));
		loginPage.getPasswordInput().sendKeys(FileOperation.getProperties("form").getProperty("password"));
		loginPage.getLoginButton().click();
	}

}
