package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;

import PageObjects.MovementPage;
import Report.Report;
import Report.Screenshot;

public class MovementValidation {

	private WebDriver driver;
	private MovementPage movementPage;

	public MovementValidation(WebDriver driver) {
		this.driver = driver;
		movementPage = new MovementPage(this.driver);
	}

	public void validationMovementPage() {
		String url = driver.getCurrentUrl();
		try {
			Assertions.assertEquals(url, "https://seubarriga.wcaquino.me/salvarMovimentacao");
			Report.log(Status.PASS, "Acessou página criação de movimentação com sucesso",
					Screenshot.captureBase64(driver));

		} catch (Exception e) {
			System.out
					.println("MovementValidation - validationMovementPage - Ocorreu um erro, verificar log de erros.");
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
	}

	public void successfullyAddMovement() {
		String label = movementPage.getsuccessfullyAddMovementInput().getText();
		try {
			Assertions.assertEquals(label, "Movimentação adicionada com sucesso!");
			Report.log(Status.PASS, "Movimentação Criada com Sucesso", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			System.out
					.println("MovementValidation - successfullyAddMovement - Ocorreu um erro, verificar log de erros.");
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}

	}
}
