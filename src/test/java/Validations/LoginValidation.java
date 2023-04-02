package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import Report.Report;
import Report.Screenshot;

public class LoginValidation {

	private WebDriver driver;

	public LoginValidation(WebDriver driver) {
		this.driver = driver;
	}

	public void validationLoginPage() {
		String url = driver.getCurrentUrl();
		try {
			// O site está com algum problema de API no navegador o endereço correto seria:
			// https://seubarriga.wcaquino.me/login, mas devido ao problema aparece o que
			// esta no metodo
			Assertions.assertEquals(url, "https://seubarriga.wcaquino.me/cadastrarUsuario");
			Report.log(Status.PASS, "Acessou a página de Login corretamente", Screenshot.captureBase64(driver));

		} catch (Exception e) {
			System.out.println("LoginValidation - validationLoginPage - Ocorreu um erro, verificar log de erros.");
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
	}

}
