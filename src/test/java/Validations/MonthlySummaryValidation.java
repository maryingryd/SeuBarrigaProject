package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;

import PageObjects.MonthlySummaryPage;
import Report.Report;
import Report.Screenshot;

public class MonthlySummaryValidation {

	private WebDriver driver;
	private MonthlySummaryPage monthlySummaryPage;
	
	public MonthlySummaryValidation(WebDriver driver) {
		this.driver = driver;
		monthlySummaryPage = new MonthlySummaryPage(this.driver);
	}

	
	public void validationRevenueInsertion() {
		String label = monthlySummaryPage.getDescriptionRevenueInput().getText();
		try {
			Assertions.assertEquals("Teste de Receita",label);
			Report.log(Status.PASS, "Teste Receita Inserido Com Sucesso", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			System.out
					.println("MonthlySummaryValidation - validationRevenueInsertion - Ocorreu um erro, verificar log de erros.");
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
	}

	public void validationExpenseInsertion() {
		String label = monthlySummaryPage.getDescriptionExpenseInput().getText();
		try {
			Assertions.assertEquals("Teste de Despesa",label);
			Report.log(Status.PASS, "Teste Despesa Inserido Com Sucesso", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			System.out
					.println("MonthlySummaryValidation - validationExpenseInsertion - Ocorreu um erro, verificar log de erros.");
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}

	}

}
