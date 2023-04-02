package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;
import Framework.TestBase;
import Report.Report;
import Report.ReportType;
import Report.Screenshot;
import Tasks.AddAccountTask;
import Tasks.HomeTask;
import Tasks.LoginTask;
import Tasks.MonthlySummaryTask;
import Tasks.MovementTask;
import Tasks.NewUserTask;

public class SeuBarrigaFeliz extends TestBase {

	private WebDriver driver = getDriverManager();

	NewUserTask newUserTask = new NewUserTask(driver);
	LoginTask loginTask = new LoginTask(driver);
	AddAccountTask addAccountTask = new AddAccountTask(driver);
	MovementTask movementTask = new MovementTask(driver);
	MonthlySummaryTask monthlySummaryTask = new MonthlySummaryTask(driver);
	HomeTask homeTask = new HomeTask(driver);

	@Test
	public void realizarCaminhoComSucesso() {
		try {
			Report.createTest("Seu Madruga Feliz", ReportType.SINGLE);
			newUserTask.occupyRegistrer();
			loginTask.efetuarLogin();
			homeTask.verificarHomePage();
			addAccountTask.addAccountRevenue();
			addAccountTask.addAccountExpense();
			movementTask.addMovementRevenue();
			movementTask.addMovementExpense();
			monthlySummaryTask.monthlySummaryCheck();

		} catch (Exception e) {
			System.out.println(
					"CaminhoFelizTest - realizarCaminhoFelizComSucesso - Ocorreu um erro, verificar log de erros.");
			System.out.println(e.getMessage());
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}
	}

}
