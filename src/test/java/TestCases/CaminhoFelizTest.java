package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.TestBase;
import Report.Report;
import Report.ReportType;
import Report.Screenshot;
import Tasks.LoginTask;
import Tasks.NewUserTask;


public class CaminhoFelizTest extends TestBase {

	private WebDriver driver = getDriverManager();

	NewUserTask newUserTask = new NewUserTask(driver);
	LoginTask loginTask = new LoginTask(driver);

	@Test
	public void realizarCaminhoFelizComSucesso() {
		try {
			System.out.println("o1");
			Report.createTest("Realizar Caminho Feliz com Sucesso", ReportType.SINGLE);
			System.out.println("o2");
			newUserTask.occupyRegistrer();
			System.out.println("o3");
			loginTask.efetuarLogin();
			System.out.println("o4");
		} catch (Exception e) {
			System.out.println("CaminhoFelizTest - realizarCaminhoFelizComSucesso - Ocorreu um erro, verificar log de erros.");
			System.out.println(e.getMessage());
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}
	}

}
