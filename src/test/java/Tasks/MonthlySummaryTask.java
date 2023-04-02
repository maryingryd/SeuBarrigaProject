package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Browser.Waits;
import PageObjects.MonthlySummaryPage;
import Validations.MonthlySummaryValidation;

public class MonthlySummaryTask {
	private WebDriver driver;
	private MonthlySummaryPage monthySummaryPage;
	private MonthlySummaryValidation monthlySummaryValidation;
	private Waits wait;

	public MonthlySummaryTask(WebDriver driver) {
		this.driver = driver;
		monthySummaryPage = new MonthlySummaryPage(this.driver);
		monthlySummaryValidation = new MonthlySummaryValidation(this.driver);
		wait = new Waits(this.driver);
	}

	public void monthlySummaryCheck() {
		monthySummaryPage.getNavMonthlySummaryInput().click();
		monthySummaryPage.getListMonthInput().click();
		monthySummaryPage.getListMonthJanuaryInput().click();
		monthySummaryPage.getListYearInput().click();
		monthySummaryPage.getListYear2023Input().click();
		monthySummaryPage.getButtonBuscarInput().click();
		wait.loadElement(monthySummaryPage.getDescriptionRevenueInput());
		monthlySummaryValidation.validationRevenueInsertion();
		monthlySummaryValidation.validationExpenseInsertion();
		monthySummaryPage.getNavLogoutInput().click();

	}

}
