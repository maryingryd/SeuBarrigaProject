package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MovementPage {

	private WebDriver driver;

	public MovementPage(WebDriver driver) {

		this.driver = driver;
	}

	// Menu Criar Movimentacao
	public WebElement getCreatMovementInput() {
		return driver.findElement(By.xpath("//div[@class='navbar-collapse']/ul/li/a[text()='Criar Movimentação']"));
	}

	// Campo Selecionar Tipo da Movimentacao
	public WebElement getTypeMovementInput() {
		return driver.findElement(By.id("tipo"));
	}

	// Campo Selecionar Receita
	public WebElement getTypeMovementRevenueInput() {
		return driver.findElement(By.xpath("//select[@id='tipo']/option[@value='REC']"));
	}

	// Campo Selecionar Despesa
	public WebElement getTypeMovementExpenseInput() {
		return driver.findElement(By.xpath("//select[@id='tipo']/option[@value='DESP']"));
	}

	// Campo Data de Movimentacao
	public WebElement getDateMovementInput() {
		return driver.findElement(By.id("data_transacao"));
	}

	// Campo Data de Pagamento
	public WebElement getDatePaymentInput() {
		return driver.findElement(By.id("data_pagamento"));
	}

	// Campo Descricao
	public WebElement getDescriptionInput() {
		return driver.findElement(By.id("descricao"));
	}

	// Campo Interessado
	public WebElement getInterestedInput() {
		return driver.findElement(By.id("interessado"));
	}

	// Campo Valor
	public WebElement getValueInput() {
		return driver.findElement(By.id("valor"));
	}

	// Campo Conta
	public WebElement getCountInput() {
		return driver.findElement(By.id("conta"));
	}

	// Campo Conta Receita
	public WebElement getCountRevenueInput() {
		return driver.findElement(By.xpath("//select[@id='conta']/option[text()='Receita']"));
	}

	// Campo Conta Despesa
	public WebElement getCountExpenseInput() {
		return driver.findElement(By.xpath("//select[@id='conta']/option[text()='Despesa']"));
	}

	// CheckBox Pago
	public WebElement getCheckBoxPaymentInput() {
		return driver.findElement(By.id("status_pago"));
	}

	// CheckBox Pendente
	public WebElement getCheckBoxPendingInput() {
		return driver.findElement(By.id("status_pendente"));
	}

	// Botão Salvar
	public WebElement getButtonSalveInput() {
		return driver.findElement(By.xpath("//div/button[text()='Salvar']"));
	}

	// Movimentação adicionada com sucesso!
	public WebElement getsuccessfullyAddMovementInput() {
		return driver.findElement(By.xpath("//div[text()='Movimentação adicionada com sucesso!'"));
	}
}
