package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.AddAccountPage;

public class AddAccountTask {
	private WebDriver driver;
	private AddAccountPage addAccountPage;

	public AddAccountTask(WebDriver driver) {

		this.driver = driver;
		addAccountPage = new AddAccountPage(this.driver);

	}

	public void addAccountRevenue() {
		addAccountPage.getMenuCountInput().click();
		addAccountPage.getCountDropDownAddInput().click();
		addAccountPage.getNameofCountInput().click();
		addAccountPage.getNameofCountInput().sendKeys("Receita");
		addAccountPage.getButtonSaveInput().click();
	}

	public void addAccountExpense() {
		addAccountPage.getMenuCountInput().click();
		addAccountPage.getCountDropDownAddInput().click();
		addAccountPage.getNameofCountInput().click();
		addAccountPage.getNameofCountInput().sendKeys("Despesa");
		addAccountPage.getButtonSaveInput().click();
	}

}
