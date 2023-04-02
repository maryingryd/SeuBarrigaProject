package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewUserPage {

	private WebDriver driver;

	public NewUserPage(WebDriver driver) {

		this.driver = driver;
	}

	// Aba Novo Usuário?

	public WebElement getMenuNewUserInput() {
		return driver.findElement(By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul/li/a[text()='Novo usuário?']"));
	}

	// Campo Nome
	public WebElement getNameInput() {
		return driver.findElement(By.id("nome"));
	}

	// Campo E-mail
	public WebElement getEmailInput() {
		return driver.findElement(By.id("email"));
	}

	// Campo E-mail
	public WebElement getPasswordInput() {
		return driver.findElement(By.id("senha"));
	}

	// Botão Cadastrar
	public WebElement getRegistrerButton() {
		return driver.findElement(By.xpath("//div[@class='jumbotron col-lg-4']/form/input[@value='Cadastrar']"));
	}

	// Mensagem Usuario Cadastrado com Sucesso	
	public WebElement getSuccessFullyRegisteredUser() {
		return driver.findElement(By.xpath("//body[@class='body-index']/div[@class='alert alert-success']"));
	}
	
}
