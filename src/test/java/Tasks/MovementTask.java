package Tasks;

import org.openqa.selenium.WebDriver;
import Framework.Browser.Waits;
import PageObjects.MonthlySummaryPage;
import PageObjects.MovementPage;

public class MovementTask {
	private WebDriver driver;
	private MovementPage movementPage;
	private MonthlySummaryPage monthlySummaryPage;
	private Waits wait;

	public MovementTask(WebDriver driver) {
		this.driver = driver;
		movementPage = new MovementPage(this.driver);
		monthlySummaryPage = new MonthlySummaryPage(this.driver);
		wait = new Waits(this.driver);
	}

	public void addMovementRevenue() {
		movementPage.getCreatMovementInput().click();
		movementPage.getTypeMovementInput().click();
		movementPage.getTypeMovementRevenueInput().click();
		movementPage.getDateMovementInput().click();
		movementPage.getDateMovementInput().sendKeys("10/01/2023");
		movementPage.getDatePaymentInput().click();
		movementPage.getDatePaymentInput().sendKeys("12/01/2023");
		movementPage.getDescriptionInput().click();
		movementPage.getDescriptionInput().sendKeys("Teste de Receita");
		movementPage.getInterestedInput().click();
		movementPage.getInterestedInput().sendKeys("Ingryd");
		movementPage.getValueInput().click();
		movementPage.getValueInput().sendKeys("100");
		movementPage.getCountInput().click();
		movementPage.getCountRevenueInput().click();
		movementPage.getCheckBoxPaymentInput().click();
		movementPage.getButtonSalveInput().click();

	}

	public void addMovementExpense() {

		movementPage.getTypeMovementInput().click();
		movementPage.getTypeMovementExpenseInput().click();
		movementPage.getDateMovementInput().click();
		movementPage.getDateMovementInput().sendKeys("14/01/2023");
		movementPage.getDatePaymentInput().click();
		movementPage.getDatePaymentInput().sendKeys("16/01/2023");
		movementPage.getDescriptionInput().click();
		movementPage.getDescriptionInput().sendKeys("Teste de Despesa");
		movementPage.getInterestedInput().click();
		movementPage.getInterestedInput().sendKeys("Ingryd");
		movementPage.getValueInput().click();
		movementPage.getValueInput().sendKeys("50");
		movementPage.getCountInput().click();
		movementPage.getCountExpenseInput().click();
		movementPage.getCheckBoxPaymentInput().click();
		movementPage.getButtonSalveInput().click();
		wait.loadElement(monthlySummaryPage.getNavMonthlySummaryInput());
	}

}
