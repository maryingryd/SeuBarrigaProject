package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;

import PageObjects.AddAccountPage;
import Report.Report;
import Report.Screenshot;

public class AddAccountValidation {

	private WebDriver driver;
	private AddAccountPage addAccountPage;

	public AddAccountValidation(WebDriver driver) {
		this.driver = driver;
		addAccountPage = new AddAccountPage(this.driver);
	}

	public void successfullyAddAccount() {
		String label = addAccountPage.getAccountSucessInput().getText();

		try {
			Assertions.assertEquals(label, "Conta adicionada com sucesso!");
			Report.log(Status.PASS, "Inseriu Conta Corretamente", Screenshot.captureBase64(driver));

		} catch (Exception e) {
			System.out
					.println("AddAccountValidation - validationNewUserPage - Ocorreu um erro, verificar log de erros.");
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
	}
}