package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import PageObjects.NewUserPage;
import Report.Report;
import Report.Screenshot;

public class NewUserValidation {

	private WebDriver driver;
	private NewUserPage newUserPage;

	public NewUserValidation(WebDriver driver) {
		this.driver = driver;
		newUserPage = new NewUserPage(this.driver);
	}

	public void validationNewUserPage() {
		String url = driver.getCurrentUrl();
		try {
			Assertions.assertEquals(url, "https://seubarriga.wcaquino.me/cadastro");
			Report.log(Status.PASS, "Acessou a página de Login corretamente", Screenshot.captureBase64(driver));

		} catch (Exception e) {
			System.out.println("NewUserValidation - validationNewUserPage - Ocorreu um erro, verificar log de erros.");
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
	}

	public void successfullyRegisteredUser() {
		String label = newUserPage.getSuccessFullyRegisteredUser().getText();
		Assertions.assertEquals("Usuário inserido com sucesso", label);
	}
}
