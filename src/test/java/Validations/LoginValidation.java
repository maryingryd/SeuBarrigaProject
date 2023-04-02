package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import PageObjects.LoginPage;
import Report.Report;
import Report.Screenshot;

public class LoginValidation {

	private WebDriver driver;
	
	public LoginValidation(WebDriver driver) {
		this.driver = driver;
		new LoginPage(this.driver);
	}

	public void validationLoginPage() {
		String url = driver.getCurrentUrl();
		try {			
			System.out.println(url);
			Assertions.assertEquals(url, "https://seubarriga.wcaquino.me/login");
			Report.log(Status.PASS, "Acessou a página de Login corretamente", Screenshot.captureBase64(driver));

		} catch (Exception e) {
			System.out.println("LoginValidation - validationLoginPage - Ocorreu um erro, verificar log de erros.");
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
	}

}
