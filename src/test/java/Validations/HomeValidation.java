package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;

import Report.Report;
import Report.Screenshot;

public class HomeValidation {

	private WebDriver driver;

	public HomeValidation(WebDriver driver) {
		this.driver = driver;
	}

	public void validationHomePage() {
		String url = driver.getCurrentUrl();
		try {
			Assertions.assertEquals(url, "https://seubarriga.wcaquino.me/logar");
			Report.log(Status.PASS, "Acessou a página Home corretamente", Screenshot.captureBase64(driver));

		} catch (Exception e) {
			System.out.println(" HomeValidation - validationHomePage - Ocorreu um erro, verificar log de erros.");
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
	}

}
