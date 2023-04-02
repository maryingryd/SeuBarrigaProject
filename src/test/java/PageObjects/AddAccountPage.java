package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddAccountPage {

	private WebDriver driver;

	public AddAccountPage(WebDriver driver) {

		this.driver = driver;
	}

	// Menu Conta
	public WebElement getMenuCountInput() {
		return driver.findElement(By.xpath("//li[2]/a[@class='dropdown-toggle']"));
	}

	// Dropdown Contas Adicionar
	public WebElement getCountDropDownAddInput() {
		return driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li[1]/a"));
	}

	// Campo Nome da Conta
	public WebElement getNameofCountInput() {
		return driver.findElement(By.xpath("//div/input[@id='nome']"));
	}

	// Dropdown Contas Listar
	public WebElement getCountDropDownListInput() {
		return driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li[2]/a"));
	}

	// Botao Salvar Conta
	public WebElement getButtonSaveInput() {
		return driver.findElement(By.xpath("//div[@class='btn-group']/button"));
	}

	// Alert Sucesso
	public WebElement getAccountSucessInput() {
		return driver.findElement(By.xpath("//div[text()='Conta adicionada com sucesso!']"));
	}

}
