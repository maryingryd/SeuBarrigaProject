package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.GenericPage;
import Report.Report;
import Report.Screenshot;

public class GenericValidation {

	private WebDriver driver;
	private GenericPage genericPage;

	public GenericValidation(WebDriver driver) {

		this.driver = driver;
		genericPage = new GenericPage(this.driver);

	}

	public void validationPageHomeLogin(String texto) {

		try {

			String label = genericPage.getHomeLogin().getText();
			Assertions.assertEquals(texto, label);
			Report.log(Status.PASS, "A página " + texto + " foi acessada com sucesso!",
					Screenshot.captureBase64(driver));

		} catch (Exception e) {

			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
	}

	public void validationPageHomeNewUser(String texto) {

		try {

			String label = genericPage.getHomeNewUser().getText();
			Assertions.assertEquals(texto, label);
			Report.log(Status.PASS, "A página " + texto + " foi acessada com sucesso!",
					Screenshot.captureBase64(driver));

		} catch (Exception e) {

			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}

	}

}
