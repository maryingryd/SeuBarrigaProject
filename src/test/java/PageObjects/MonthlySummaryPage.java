package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MonthlySummaryPage {

	private WebDriver driver;

	public MonthlySummaryPage(WebDriver driver) {

		this.driver = driver;
	}

	// Menu Resumo Mensal
	public WebElement getNavMonthlySummaryInput() {
		return driver.findElement(By.xpath("//div[@class='navbar-collapse']/ul/li/a[text()='Resumo Mensal']"));
	}

	// Lista Meses
	public WebElement getListMonthInput() {
		return driver.findElement(By.id("mes"));
	}

	// Mes Janeiro
	public WebElement getListMonthJanuaryInput() {
		return driver.findElement(By.xpath("//select[@id='mes']/option[@value='01']"));
	}

	// Anos
	public WebElement getListYearInput() {
		return driver.findElement(By.id("ano"));
	}

	// Ano 2023
	public WebElement getListYear2023Input() {
		return driver.findElement(By.xpath("//select[@id='ano']/option[@value='2023']"));
	}

	// Botão Buscar
	public WebElement getButtonBuscarInput() {
		return driver.findElement(By.xpath("//input[@value='Buscar']"));
	}

	// Campo Tipo de Conta Receita
	public WebElement getDescriptionRevenueInput() {
		return driver.findElement(By.xpath("//div/table/tbody/tr/td[text()='Teste de Receita']"));
	}

	// Campo Tipo de Conta Despesa
	public WebElement getDescriptionExpenseInput() {
		return driver.findElement(By.xpath("//div/table/tbody/tr/td[text()='Teste de Despesa']"));
	}
	// Menu Sair

	public WebElement getNavLogoutInput() {
		return driver.findElement(By.xpath("//div[@class='navbar-collapse']/ul/li/a[text()='Sair']"));
	}

}
